package com.yuemaz.wiki;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
@MapperScan("com.yuemaz.wiki.mapper")
public class WikiApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("地址: \thttp://" + Inet4Address.getLocalHost().getHostAddress() + ":{}", env.getProperty("server.port"));
    }

}
