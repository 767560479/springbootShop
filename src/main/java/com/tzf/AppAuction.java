/**
 *  @Title:  AppAuction.java 
 *  @author: tzf
 *  @Description:    TODO(用一句话描述该文件做什么)
 *  @date:   2019年4月23日 下午8:17:30 
 *
 */
package com.tzf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tzf.dao")
public class AppAuction {
	
	public static void main(String[] args) {
		SpringApplication.run(AppAuction.class, args);
	}
}
