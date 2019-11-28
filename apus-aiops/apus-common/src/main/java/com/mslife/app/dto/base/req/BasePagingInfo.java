package com.mslife.app.dto.base.req;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import com.github.pagehelper.PageInfo;
/**
 * 分页的基本信息
 * @author jinannan
 *
 */
public class BasePagingInfo  implements Serializable{

	private static final long serialVersionUID = 6253501333631512845L;
	/**请求数据的分页起始页码从0开始**/
	@NotNull
	@Digits(integer=10000,fraction=0)//整数位数和小数位数的的上限
	private int page=0;
	/**每页多少条数据**/
	@NotNull
	@Digits(integer=10,fraction=0)//整数位数和小数位数的的上限
	private int pageSize=10;
	/**总页数**/
	private int pages;
	/**总数据条数**/
	private int totalSize;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public static BasePagingInfo newPagingInfo() {
		BasePagingInfo pageInfo=new BasePagingInfo();
		pageInfo.setPage(1);
		pageInfo.setPageSize(10);
		return pageInfo;
	}
	
	public static BasePagingInfo pageTrans(@SuppressWarnings("rawtypes") PageInfo page) {
		BasePagingInfo pageInfo=new BasePagingInfo();
		pageInfo.setPage(page.getPageNum());
		pageInfo.setPageSize(page.getPageSize());
		pageInfo.setTotalSize((int) page.getTotal());
		pageInfo.setPages(page.getPages());
		return pageInfo;
	}
}
