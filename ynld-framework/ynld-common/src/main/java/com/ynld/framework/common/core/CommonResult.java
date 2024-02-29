package com.ynld.framework.common.core;

import com.ynld.framework.common.exception.GlobalCodeConstants;
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
    return CommonResult.success("操作成功");
  }

  public static <T> CommonResult<T> success(String msg) {
    return CommonResult.success(msg, null);
  }

  public static <T> CommonResult<T> success(T data) {
    return CommonResult.success("操作成功", data);
  }

  public static <T> CommonResult<T> success(String msg, T data) {
    return new CommonResult<>(GlobalCodeConstants.SUCCESS.getCode(), msg, data);
  }

  public static <T> CommonResult<T> error() {
    return CommonResult.error("操作失败");
  }

  public static <T> CommonResult<T> error(String msg) {
    return CommonResult.error(msg, null);
  }

  public static <T> CommonResult<T> error(T data) {
    return CommonResult.error("操作失败", data);
  }

  public static <T> CommonResult<T> error(String msg, T data) {
    return new CommonResult<>(GlobalCodeConstants.SERVER_ERROR.getCode(), msg, data);
  }
}
