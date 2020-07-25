package com.veasymall.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

// 注意要引用 tk.mybatis 的 MapperScan
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.veasymall.api.mapper")
public class ApiApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApiApplication.class).run(args);
		// SpringApplication.run(ApiApplication.class, args); // 两句的写法等价
	}

}
