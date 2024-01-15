package com.daichi.tonnbi.javautils.paging;

import java.util.List;

public class PagingList<T> {
	/** 指定のページのデータのリスト */
	private final List<T> pageData;
	/** 条件に合致するレコード総数 */
	private final long totalCount;
	/** 現在ページ */
	private final int pageNumber;
	/** 合計ページ数 */
	private final int totalPages;

	public PagingList(List<T> pageData, long totalCount, int pageNumber, int totalPages) {
		this.pageData = pageData;
		this.totalCount = totalCount;
		this.pageNumber = pageNumber;
		this.totalPages = totalPages;
	}

	public List<T> getPageData() {
		return pageData;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public int getTotalPages() {
		return totalPages;
	}
}
