package com.ynld.framework.common.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ynld.framework.common.exception.GlobalErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author zhang_jq
 * @date 2024/2/29
 * @apiNote description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResult<T> implements Serializable {

  @Serial
  private static final long serialVersionUID = -8633116446499980755L;

  /**
   * 状态码
   */
  private Integer code;

  /**
   * 返回内容
   */
  private String msg;

  /**
   * 数据对象
   */
  private T data;


  public static <T> CommonResult<T> success() {
    return restResult(GlobalErrorCode.SUCCESS.getCode(), GlobalErrorCode.SUCCESS.getMessage(), null);
  }

  public static <T> CommonResult<T> success(T data) {
    return restResult(GlobalErrorCode.SUCCESS.getCode(), GlobalErrorCode.SUCCESS.getMessage(), data);
  }

  public static <T> CommonResult<T> success(String msg) {
    return restResult(GlobalErrorCode.SUCCESS.getCode(), msg, null);
  }

  public static <T> CommonResult<T> error() {
    return error(GlobalErrorCode.SERVER_ERROR.getCode(), GlobalErrorCode.SERVER_ERROR.getMessage());
  }

  public static <T> CommonResult<T> error(GlobalErrorCode errorCode) {
    return error(errorCode.getCode(), errorCode.getMessage());
  }

  public static <T> CommonResult<T> error(Integer code, String msg) {
    return restResult(code, msg, null);
  }

  public static <T> CommonResult<T> restResult(Integer code, String msg, T data) {
    return new CommonResult<>(code, msg, data);
  }
}
