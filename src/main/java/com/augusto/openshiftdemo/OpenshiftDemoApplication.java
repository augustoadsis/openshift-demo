package com.augusto.openshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OpenshiftDemoApplication {

    @GetMapping
    public ResponseEntity<Object> demo() {
        return ResponseEntity.ok().body("demo");
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftDemoApplication.class, args);
    }

}
