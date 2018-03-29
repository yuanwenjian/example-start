package com.yuanwj.rest;

import com.yuanwj.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bmk on 18-3-29.
 */
@RestController
@RequestMapping(value = "/api/v1/test")
public class TestController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(value = "test")
    public String test(){
        return exampleService.add(10)+"";
    }
}
