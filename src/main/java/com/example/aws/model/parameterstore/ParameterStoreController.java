package com.example.aws.model.parameterstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi/v1/params-store")
public class ParameterStoreController {
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @GetMapping
    public ResponseEntity<String> param() {
        return ResponseEntity.ok(username + " / " + password);
    }
}
