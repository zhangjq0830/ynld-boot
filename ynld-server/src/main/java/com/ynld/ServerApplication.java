package com.ynld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhang_jq
 * @date 2024/2/22
 * @apiNote 系统启动类
 */
@Slf4j
@SpringBootApplication
public class ServerApplication extends SpringBootServletInitializer {
  public static void main(String[] args) throws UnknownHostException {
    ConfigurableApplicationContext context = SpringApplication.run(ServerApplication.class, args);
    ConfigurableEnvironment env = context.getEnvironment();
    String ip = InetAddress.getLocalHost().getHostAddress();
    String port = env.getProperty("server.port");
    String active = env.getProperty("spring.profiles.active");
    String path = env.getProperty("server.servlet.context-path");
    log.info("\n----------------------------------------------------------\n\t" +
            "Application Ynld-Boot is running! Access URLs:\n\t" +
            "示例程序【" + active + "】环境已启动! 地址如下:\n\t" +
            "Local: \t\thttp://localhost:" + port + path + "\n\t" +
            "External: \thttp://" + ip + ':' + port + path + '\n' +
            "Swagger文档: \thttp://" + ip + ":" + port + path + "/doc.html\n" +
            "----------------------------------------------------------");
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(ServerApplication.class);
  }
}
