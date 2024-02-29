package com.ynld;

import com.ynld.framework.common.core.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang_jq
 * @date 2024/2/29
 * @apiNote description
 */
@RestController
public class DemoController {

  @GetMapping("/demo")
  public CommonResult<String> demo() {
    return CommonResult.success("Hello, World!");
  }
}
