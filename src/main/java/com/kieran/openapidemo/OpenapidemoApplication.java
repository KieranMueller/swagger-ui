package com.kieran.openapidemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Cat API", version = "1.0",
        description = "A hello world open API application"))
public class OpenapidemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenapidemoApplication.class, args);
    }

}
