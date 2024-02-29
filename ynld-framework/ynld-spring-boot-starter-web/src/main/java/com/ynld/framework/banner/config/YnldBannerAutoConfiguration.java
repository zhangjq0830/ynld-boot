package com.ynld.framework.banner.config;

import com.ynld.framework.banner.core.BannerApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhang_jq
 * @date 2024/2/28
 * @apiNote description
 */
@Configuration
public class YnldBannerAutoConfiguration {
  @Bean
  public BannerApplicationRunner bannerApplicationRunner() {
    return new BannerApplicationRunner();
  }
}
