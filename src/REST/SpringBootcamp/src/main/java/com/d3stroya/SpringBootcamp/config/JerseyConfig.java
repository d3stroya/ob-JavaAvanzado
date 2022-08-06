package com.d3stroya.SpringBootcamp.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // Indica dónde están los controladores
        this.packages("com.d3stroya.SpringBootcamp.controllers");
    }
}
