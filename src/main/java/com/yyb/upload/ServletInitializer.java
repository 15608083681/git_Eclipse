package com.yyb.upload;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Title:tomcat 启动类 
 * 
 * @Copyright: Copyright (c) 2017 chengdu  Company:成都金控数据
 * @author JKSJ-YeYanBin  2018年1月11日 下午4:16:06
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UploadApplication.class);
	}

}
