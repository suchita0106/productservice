package com.microservice.productservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
    private String errorMessage;
    private String errorCode;
	// public ErrorResponse(String message, String errorCode2) {
	// 	// TODO Auto-generated constructor stub
	// 	super();
	// 	this.errorMessage = message;
	// 	this.errorCode = errorCode2;
	// }
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
    
    
    
}