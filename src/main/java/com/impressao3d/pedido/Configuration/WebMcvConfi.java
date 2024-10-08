package com.impressao3d.pedido.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMcvConfi implements WebMvcConfigurer {
    // @Override
    // public void addResourceHandlers(ResourceHandlerRepository registry){
        
    //     registry.addResourceHandler("/css/**")
    //     .addResourceLocations("classpath:/static/css/"); 
    // }

}
