package com.saeframework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by An0nymous on 15/8/3.
 */
@Controller
public class  jumpJsp{
    @RequestMapping("/showJsp")
    public String view(Model model) {
        model.addAttribute("codingTest","测试页面");
       return "test";
    }
}
