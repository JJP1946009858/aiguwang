package com;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "FUCK YOU";
    }
}
