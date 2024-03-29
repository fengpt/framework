package com.freestyle.framework.exception;

/**
 * 业务通用异常，定义了错误码方便框架处理
 * @author huangxiaohui
 *
 */
public class FreestyleException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String errorCode;
    private String errorMessage;

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

    public FreestyleException() {
        super();
    }

    public FreestyleException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public FreestyleException(String errorCode, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    protected FreestyleException(String errorCode, String errorMessage, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
        super(errorMessage, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
