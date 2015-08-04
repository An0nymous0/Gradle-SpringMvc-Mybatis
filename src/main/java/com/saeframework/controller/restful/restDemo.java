package com.saeframework.controller.restful;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Created by An0nymous on 15/8/3.
 */
@RestController
public class restDemo {
    @RequestMapping("/rest")
    public JSONObject view() {
        JSONObject jsonObj = new JSONObject(true);
        jsonObj.put("name","restful-showcase");
       return jsonObj;
    }
}
