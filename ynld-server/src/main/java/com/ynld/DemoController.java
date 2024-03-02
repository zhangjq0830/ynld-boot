package com.ynld;

import com.ynld.framework.common.core.CommonResult;
import com.ynld.framework.common.exception.GlobalErrorCode;
import com.ynld.framework.common.exception.ServerException;
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

    try {
      int i = 1 / 0;
    } catch (Exception e) {
      throw new ServerException(1,"有错误");
    }
    return CommonResult.success();
  }
}
