package com.ynld.framework.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serial;

/**
 * @author zhang_jq
 * @date 2024/3/2 10:58
 * @apiNote 业务逻辑异常 Exception
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = 5199629606344712397L;

  /**
   * 错误码
   */
  private Integer code;

  /**
   * 错误提示
   */
  private String message;

  public ServiceException(GlobalErrorCode errorCode) {
    this.code = errorCode.getCode();
    this.message = errorCode.getMessage();
  }
}
