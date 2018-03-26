package org.janine.jian.common.page;

public class PageTools {

	/**
	 * 每页数量
	 */
	private int pageSize;
	/**
	 * 当前页码
	 */
	private int pageNo;
	/**
	 * 总页数
	 */
	private int pageSum;
	/**
	 * 总记录数
	 */
	private int record;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSum() {
		return pageSum;
	}
	public void setPageSum(int pageSum) {
		this.pageSum = pageSum;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	
	
}
