package com.nwoc.a3gs.group.app.config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		
		

//		registry.addResourceHandler("/**/*").addResourceLocations("classpath:/public/").resourceChain(true)
//				.addResolver(new PathResourceResolver() {
//					@Override
//					protected Resource getResource(String resourcePath, Resource location) throws IOException {
//						Resource requestedResource = location.createRelative(resourcePath);
//						return requestedResource.exists() && requestedResource.isReadable() ? requestedResource
//								: new ClassPathResource("/public/index.html");
//					}
//				});
	}
}
