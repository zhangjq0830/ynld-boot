package com.ynld.framework.common.utils;

import cn.hutool.core.util.StrUtil;

/**
 * @author zhang_jq
 * @date 2024/3/1
 * @apiNote description
 */
public class StringUtils {

  /**
   * * 判断一个字符串是否为空串（不验证空白字符）
   *
   * @param str String
   * @return true：为空  false：非空
   */
  public static boolean isEmpty(String str) {
    return StrUtil.isEmpty(str);
  }

  /**
   * * 判断一个字符串是否为空串（验证空白字符）
   *
   * @param str String
   * @return true：为空  false：非空
   */
  public static boolean isBlank(String str) {
    return StrUtil.isBlank(str);
  }
}
