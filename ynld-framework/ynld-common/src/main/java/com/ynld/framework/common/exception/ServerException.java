package com.ynld.framework.common.exception;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serial;

/**
 * @author zhang_jq
 * @date 2024/3/2 9:08
 * @apiNote 服务器异常 Exception
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class ServerException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = -1966278528117642328L;

  /**
   * 错误码
   */
  private Integer code;

  /**
   * 错误提示
   */
  private String message;

  public ServerException(GlobalErrorCode errorCode) {
    this.code = errorCode.getCode();
    this.message = errorCode.getMessage();
  }
}
