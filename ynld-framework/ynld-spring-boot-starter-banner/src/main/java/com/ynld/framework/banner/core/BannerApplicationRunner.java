package com.ynld.framework.banner.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhang_jq
 * @date 2024/2/28
 * @apiNote description
 */
@Slf4j
public class BannerApplicationRunner implements ApplicationRunner {

  @Autowired
  private Environment environment;

  @Override
  public void run(ApplicationArguments args) throws UnknownHostException {
    String ip = InetAddress.getLocalHost().getHostAddress();
    String port = environment.getProperty("server.port");
    String path = environment.getProperty("server.servlet.context-path");
    String active = environment.getProperty("spring.profiles.active");

    log.info("\n----------------------------------------------------------\n\t" +
            "Application Ynld-Boot is running! Access URLs:\n\t" +
            "示例程序【" + active + "】环境已启动! 地址如下:\n\t" +
            "Local: \t\thttp://localhost:" + port + path + "\n\t" +
            "External: \thttp://" + ip + ':' + port + path + "\n\t" +
            "Api文档: \thttp://" + ip + ":" + port + path + "/doc.html\n" +
            "----------------------------------------------------------");
  }
}
