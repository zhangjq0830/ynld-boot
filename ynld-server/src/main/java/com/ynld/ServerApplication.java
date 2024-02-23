package com.ynld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author zhang_jq
 * @date 2024/2/22
 * @apiNote 系统启动类
 */
@SpringBootApplication
public class ServerApplication extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(ServerApplication.class, args);
    System.out.println("ServerApplication启动成功");
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(ServerApplication.class);
  }
}
