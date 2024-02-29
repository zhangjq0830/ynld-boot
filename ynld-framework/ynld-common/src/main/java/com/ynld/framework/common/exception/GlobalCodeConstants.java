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
public enum GlobalCodeConstants {
  SUCCESS(200, "成功"),

  //   ========== 客户端错误段 ==========
  BAD_REQUEST(400, "请求参数不正确"),
  UNAUTHORIZED(401, "账号未登录"),
  FORBIDDEN(403, "没有该操作权限"),
  NOT_FOUND(404, "请求未找到"),
  METHOD_NOT_ALLOWED(405, "请求方法不正确"),
  REQUEST_TIMEOUT(408, "请求超时"),
  CONFLICT(409, "资源冲突"),
  REQUEST_ENTITY_TOO_LARGE(413, "请求实体过大"),
  UNSUPPORTED_MEDIA_TYPE(415, "不支持的媒体类型"),
  UNPROCESSABLE_ENTITY(422, "请求实体无法处理"),
  TOO_MANY_REQUESTS(429, "请求过多"),

  //   ========== 服务端错误段 ==========
  SERVER_ERROR(500, "服务器内部错误"),
  BAD_GATEWAY(502, "网关错误"),
  SERVICE_UNAVAILABLE(503, "服务不可用");

  private final Integer code;
  private final String message;
}
