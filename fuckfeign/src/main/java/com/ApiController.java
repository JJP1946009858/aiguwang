package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Qualifier("eurekaclient")
    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }



}
