package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.dao")
@EnableSwagger2  //开启Swagger
@EnableScheduling //开启定时任务
@EnableAsync  //开启异步任务
public class Duanpencghang {


 public static void main(String[] args) {

  SpringApplication.run(Duanpencghang.class, args);

 }

}
