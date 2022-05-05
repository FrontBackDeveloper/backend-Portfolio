
package com.miapp.portfoliowebb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Habilitamos peticiones de distintos origenes.
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
 
     @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*");
    }
}
