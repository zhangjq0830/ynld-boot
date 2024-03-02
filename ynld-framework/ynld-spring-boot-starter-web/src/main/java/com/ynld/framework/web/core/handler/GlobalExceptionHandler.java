package com.ynld.framework.web.core.handler;

import com.ynld.framework.common.core.CommonResult;
import com.ynld.framework.common.exception.GlobalErrorCode;
import com.ynld.framework.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zhang_jq
 * @date 2024/3/2 10:44
 * @apiNote description
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  @ExceptionHandler(ServiceException.class)
  public CommonResult<?> serviceExceptionHandler(ServiceException ex) {
    log.error("[serviceExceptionHandler]", ex);
    return CommonResult.error(ex.getCode(), ex.getMessage());
  }

  @ExceptionHandler(Exception.class)
  public CommonResult<?> exceptionHandler(Exception ex) {
    log.error("[exceptionHandler]", ex);
    return CommonResult.error();
  }
}
