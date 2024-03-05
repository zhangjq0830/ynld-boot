package com.ynld.system.controller;

import com.ynld.framework.common.core.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang_jq
 * @date 2024/3/4 14:33
 * @apiNote description
 */

@RestController
public class DemoController {

  @GetMapping("/demo")
  public CommonResult<?> demo() {
    return CommonResult.success();
  }
}
