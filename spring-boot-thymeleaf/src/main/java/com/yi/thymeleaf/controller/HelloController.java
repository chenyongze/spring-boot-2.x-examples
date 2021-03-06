package com.yi.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用前端模板并返回数据
 * @author YI
 * @date 2018-8-21 09:50:09
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("say", "Hello World And Thymeleaf");

        return "index";
    }
}
