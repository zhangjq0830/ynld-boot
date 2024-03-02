package com.ynld.framework.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhang_jq
 * @date 2024/2/29
 * @apiNote description
 */
@Getter
@AllArgsConstructor
public enum GlobalErrorCode {
  SUCCESS(200, "操作成功"),

  //   ========== 客户端错误段 ==========
  BAD_REQUEST(400, "请求参数不正确"),
  UNAUTHORIZED(401, "账号未登录"),
  FORBIDDEN(403, "没有该操作权限"),
  NOT_FOUND(404, "请求未找到"),
  METHOD_NOT_ALLOWED(405, "请求方法不正确"),
  REQUEST_TIMEOUT(408, "请求超时"),
  UNSUPPORTED_MEDIA_TYPE(415, "不支持的媒体类型"),
  TOO_MANY_REQUESTS(429, "请求过于频繁，请稍后重试"),

  //   ========== 服务端错误段 ==========
  SERVER_ERROR(500, "服务器内部错误"),
  BAD_CONFIGURATION(502, "错误的配置项"),

  //   ========== 业务错误段 ==========
  UNKNOWN_ERROR(999, "未知错误");

  private final Integer code;
  private final String message;
}
