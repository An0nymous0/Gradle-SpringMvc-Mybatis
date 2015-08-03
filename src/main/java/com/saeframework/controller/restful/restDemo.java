package com.saeframework.controller.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Created by An0nymous on 15/8/3.
 */
@RestController
public class restDemo {
    @RequestMapping("/rest")
    public Object view() {
       return "restful-showcase";
    }
}
