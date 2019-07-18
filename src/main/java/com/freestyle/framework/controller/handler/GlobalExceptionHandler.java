package com.freestyle.framework.controller.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.freestyle.framework.common.ResponseData;
import com.freestyle.framework.enums.CommonEnum;
import com.freestyle.framework.exception.FreestyleException;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@ResponseBody
@Log4j
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleRuntimeException(RuntimeException ex) {
        log.error("handleRuntimeException:", ex);
        return new ResponseEntity<>(ResponseData.badRequest(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FreestyleException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleBizException(FreestyleException ex, HttpServletRequest request) {
        log.error("defaultErrorHandler:", ex);
        return new ResponseEntity<>(ResponseData.badRequest(ex.getErrorCode(), ex.getErrorMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 用来捕获404，400这种无法到达controller的错误及其他不可预知异常
     * @param ex
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> defaultErrorHandler(Exception ex) throws Exception {
        log.error("defaultErrorHandler:", ex);
        ResponseData<?> responseData = ResponseData.badRequest();
        HttpStatus status = null;
        if (ex instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            responseData.setCode(CommonEnum.NO_HANDLER_EXCEPTIONS.getCode());
            responseData.setMessage(CommonEnum.NO_HANDLER_EXCEPTIONS.getMessage());
            status = HttpStatus.NOT_FOUND;
        } else {
            responseData.setCode(CommonEnum.SYS_ERROR.getCode());
            responseData.setMessage(CommonEnum.SYS_ERROR.getMessage());
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(responseData, status);
    }

}