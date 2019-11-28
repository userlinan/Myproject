package com.mslife.app.utils;

import java.net.InetAddress;

import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mslife.app.exception.BaseException;

/**
 * 
 * @author linannan
 *
 */
public class OSUtil {

	private static final Logger logger=LoggerFactory.getLogger(OSUtil.class);
	/**
	 * 判断当前系统是否是windows系统
	 * @return
	 */
	public static boolean isWindowsOS() {
		boolean isWindowsOS=false;
		String osName=System.getProperty("os.name");
		//indexOf("windows")>-1表示存在比较的字符串
		if(osName.toLowerCase().indexOf("windows")>-1) {
			isWindowsOS=true;
		}
		return isWindowsOS;
	}
	public static String getLocalIP() {
		String sIP="";
		InetAddress ip=null;
		try {
			if(isWindowsOS()) {
				ip=InetAddress.getLocalHost();
			}else {//如果是linux系统
				boolean bFingIP=false;
				//获得网络接口
				Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface.getNetworkInterfaces();
				while(netInterfaces.hasMoreElements()) {
					if(bFingIP) {
						break;
					}
					NetworkInterface ni=netInterfaces.nextElement();
					//遍历所有的IP
					Enumeration<InetAddress> ips=ni.getInetAddresses();
					while(ips.hasMoreElements()) {//次枚举是否包含更多元素
						ip=ips.nextElement();
						if(ip.isSiteLocalAddress() && !ip.isLoopbackAddress() && ip.getHostAddress().indexOf(":") == -1) {
							bFingIP=true;
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			logger.error("系统异常"+e.getMessage());
			throw new BaseException(e);
		}
		if(null!=ip) {
			sIP=ip.getHostAddress();
		}
		return sIP;
	}
	/**
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip=request.getHeader("x-forwarded-for");//是一个扩展头
		if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)) {
			ip=request.getHeader("Proxy-Client-IP");
		}
		if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)) {
			ip=request.getHeader("WL-Proxy-Client-IP");
		}
		if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)) {
			ip=request.getRemoteAddr();//获取客户端的 地址 
			if("127.0.0.1".equals(ip) || "0:0:0:0:0:0:0:1".equals(ip)) {
				
			}
			
		}
		return null;
	}
}
