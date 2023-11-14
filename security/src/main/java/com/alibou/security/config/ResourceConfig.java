package com.alibou.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Đặt đường dẫn tới thư mục chứa tài nguyên tĩnh (ví dụ: CSS, JS, hình ảnh)
        // Ảnh tài nguyên được lưu trữ trong thư mục "static"
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/static/");
    }
}

