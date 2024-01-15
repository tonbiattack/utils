package com.daichi.tonnbi.javautils.api.response;

/**
 * 継承して仕様される前提のクラス
 */
public class BasicResponse {
	/** Errorがない場合でも明示的にfalseを返す */
	private boolean error = false;
	private String errorCode;
	private String errorMessage;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
