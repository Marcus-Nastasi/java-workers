package com.novaRest.app.newWorkers.Controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebConfig extends DelegatingWebMvcConfiguration {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("http://localhost:5173/");
    }
}


