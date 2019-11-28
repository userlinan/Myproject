package com.mslife.app.utils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 字符串处理及转换工具类
 * @author linannan
 *
 */
public class StringUtil {
	/**字符串的空格、回车、换行符、制表符**/
	public static Pattern blankPattern=Pattern.compile("\\s*|\t|\r|\n");
	/**非数字**/
	public static Pattern notNumberPattern = Pattern.compile("\\D+");
	/**特殊字符串**/
	public static final String SPLIT_STR_PATTERN = ",|，|;|；|、|\\.|。|-|_|\\(|\\)|\\[|\\]|\\{|\\}|\\\\|/| |　|\"";
	/**判断是否是数字**/
	public static Pattern numericStringPattern=Pattern.compile("\"^[0-9\\\\-\\\\-]+$\"");
	/**删除左右空格，如果为null返回**/
	public static String trim(String str) {
		if(str==null) {
			return "";
		}
		return str.trim();
	}
	/**
	 * 将 object 转为string value 并去掉空格，若 若object为null返回空字串
	 * @param value
	 * @return
	 */
	public static String getString(Object value) {
		if(value==null) {
			return "";
		}
		return String.valueOf(value).trim();
	}
	/**
	 * 把String array or list用给定的符号symbol连接成一个字符串
	 * @param array
	 * @param symbol
	 * @return
	 */
	@SuppressWarnings("rawtypes") //忽略警告信息
	public static String joinString(List array,String symbol) {
		String result="";
		if(array!=null) {
			for(int i=0;i<array.size();i++) {
				String temp=array.get(i).toString();
				if(temp!=null && temp.trim().length()>0) {
					result+=(temp+symbol);
				}
			}
			if(result.length()>1) {
				result=result.substring(0,result.length()-1);//提取0到长度减一之间的字符串部分
			}
		}
		return result;
	}
	/**
	 * 把String array or list用给定的符号symbol连接成一个字符串
	 * @param array
	 * @param symbol
	 * @return
	 */
	public static String joinString(String[] array,String symbol) {
		String result="";
		if(array!=null) {
			for(int i=0;i<array.length;i++) {
				String temp=array[i];
				if(temp!=null && temp.trim().length()>0) {
					result+=(temp+symbol);
				}
			}
			if(result.length()>1) {
				result=result.substring(0,result.length()-1);
			}
		}
		return result;
	}
	/**
	 * 截取字符串 超出的字符用...代替
	 * @param subString
	 * @param size
	 * @return
	 */
	public static String subStringNotEncode(String subString,int size) {
		if(subString!=null && subString.length()>size) {
			subString=subString.substring( 0, size)+"...";
		}
		return subString;
	}
	/**
	 * 截取字符串 超出的字符用symbol代替
	 * @param str
	 * @param len    //字符串长度，长度计量单位为一个GBK,汉字两个应为字母计算为一个长度单位
	 * @param symbol
	 * @return
	 */
	public static String getLimitLengthString(String str,int len,String symbol) {
		int ilen=len*2;
		int coutOfDoubleByte=0;
		String strRet="";
		try {
			if(str!=null) {
				byte[] b=str.getBytes("GBK");
				if(b.length<=ilen) {
					return str;
				}
				for(int i=0;i<ilen;i++) {
					if(b[i]<0) {
						coutOfDoubleByte++;
					}
				}
				if(coutOfDoubleByte%2==0) {
					strRet=new String(b,0,ilen,"GBK")+symbol;
					return strRet;
				}else {
					strRet=new String(b,0,ilen-1,"GBK")+symbol;
					return strRet;
				}
			}else {
				return "";
			}
		} catch (Exception e) {
			return str.substring(0,len);
		}finally {
			strRet=null;
		}
		
	}
	/**
	 * 
	 * @param str
	 * @param size
	 * @return
	 */
	public static String getLimitLengthString(String str,int size) {
		return getLimitLengthString(str,size,"...");
		
	}
	
	/**
	 * 截取字符，不转码
	 * @param subject
	 * @param size
	 * @return
	 */
	public static String subStrNotEncode(String subject,int size) {
		if(subject.length()>size) {
			subject=subject.substring(0,size);
		}
		return subject;
	}
	/**
	 * 截取字符，不转码，从后往前
	 * @param subject
	 * @param size
	 * @return
	 */
	public static String subStrNotEncodeLast(String subject,int size) {
		if(subject.length()>size) {
			subject=subject.substring(size,subject.length());
		}
		return subject;
	}
	/**
	 * 取得字符串的实际长度（考虑了汉字的情况）
	 * @param srcStr
	 * @return
	 */
	public static int getStringLen (String srcStr) {
		int result=0;
		if(srcStr!=null) {
			char[] theChars=srcStr.toCharArray();
			for(int i=0;i<theChars.length;i++) {
				result+=(theChars[i]<=255)?1:2;
			}
		}
		return result;
	}
	/**
	 * 检查数据串中是否包含非法字符集
	 * @param str
	 * @return
	 */
	public static boolean check(String str) {
		String sIllegal="'\'";
		int len=sIllegal.length();
		if(null==str) {
			return false;
		}
		for(int i=0;i<len;i++) {
			if(str.indexOf(sIllegal.charAt(i))!=-1) {
				return true;
			}
		}
		return false;	
	}
	/**
	 * 隐藏邮件地址前缀
	 * @param email
	 * @return
	 */
	public static String getHideEmailPrefix(String email) {
		if(null!=email) {
			int index=email.lastIndexOf('@');
			if(index>0) {
				email=repeat("*",index).concat(email.substring(index));
			}
		}
		return email;
	}
	/**
	 * repeat--通过源字符串重复生成N次组成新的字符串
	 * @param string
	 * @param index
	 * @return
	 */
	private static String repeat(String string, int index) {
		StringBuffer s=new StringBuffer();
		for(int i=0;i<index;i++) {
			s.append(string);
		}
		return s.toString();
	}
	/**
	 * 根据指定的字符把源字符串分割成一个数组
	 * @param pattern
	 * @param src
	 * @return
	 */
	public static List<String> parseString2ListByCustomerPattern(String pattern, String src){
		if(src==null) {
			return null;
		}
		List<String> list=new ArrayList<String>();
		String[] result=src.split(pattern);
		for(int i=0;i<result.length;i++) {
			list.add(result[i]);
		}
		return list;
	}
	/**
	 * 根据指定的字符串分割成一个数组
	 * @param src
	 * @return
	 */
	public static List<String> parseString2ListByPattern(String src){
		String pattern=pattern = "，|,|、|。";
		return parseString2ListByCustomerPattern(pattern,src);	
	}
	/**
	 * 格式化一个float
	 * @param f
	 * @param format
	 * @return
	 */
	public static String formatFloat(float f,String format) {
		DecimalFormat df=new DecimalFormat(format);
		return df.format(f);
	}
	/**
	 * 判断是否是空字符串null和"",返回true
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(String s) {
		if(s!=null && !s.equals("")) {
			return false;
		}
		return true;
	}
	/**
	 * 判断对象是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(Object str) {
		boolean flag=true;
		if(str!=null && !str.equals("")) {
			if(str.toString().length()>0) {
				flag=true;
			}
		}else {
			flag=false;
		}
		return flag;
	}
	/**
	 * 判断是否是空字符串null和"",返回result,
	 * @param s
	 * @param result
	 * @return
	 */
	public static String isEmpty(String s,String result) {
		if(s!=null && !s.equals("") ) {
			return s;
		}
		return result;
	}
	/**
	 * 自定义分割字符串函数
	 * @param split
	 * @param src
	 * @return
	 */
	public static List<String> spitToList(String split,String src){
		String sp=",";
		if(split!=null && split.length()==1) {
			sp=split;
		}
		List<String> r=new ArrayList<String>();
		int lastIndex=-1;
		int index=src.indexOf(sp);//int indexOf(String str): 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
		if(-1==index && src!=null) {
			r.add(src);
			return r;
		}
		while(index>=0) {
			if(index>lastIndex) {
				r.add(src.substring(lastIndex+1,index));
			}else {
				r.add("");
			}
			lastIndex=index;
			index=src.indexOf(sp,index+1);//int indexOf(String str, int fromIndex): 返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
			
			if(index==-1) {
				r.add(src.substring(lastIndex+1,src.length()));
			}
		}
		return r;
	}
	
	public static boolean isEmpt(String str) {
		if(str!=null && str.equals("")) {
			return false;
		}
		return true;
	}
	

}

