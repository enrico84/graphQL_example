package com.graphql.java.news.exception;

public class InfasamentoException extends Exception {

    private static final long serialVersionUID = 8583284958657302305L;
    private int errorCode;

    public InfasamentoException(int errorCode, String messege) {
	super(messege);
	this.errorCode = errorCode;
    }

    public int getErrorCode() {
	return errorCode;
    }

    public void setErrorCode(int errorCode) {
	this.errorCode = errorCode;
    }

}
