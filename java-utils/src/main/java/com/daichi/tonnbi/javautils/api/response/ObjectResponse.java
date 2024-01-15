package com.daichi.tonnbi.javautils.api.response;

/**
 * 汎用的なAPIレスポンスを表すクラス。
 * 任意の型のオブジェクトを含めることができます。
 *
 * @param <T> レスポンスとして含めるオブジェクトの型
 */
public class ObjectResponse<T> extends BasicResponse {
	private T obj;

	public ObjectResponse() {
	}

	public ObjectResponse(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
