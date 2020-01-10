package com.mooc.sb2.controller;

import com.mooc.sb2.bean.Demo;
import com.mooc.sb2.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/1/10 2:09
 **/
@Controller
@Component
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable(value = "id") Long id) {
        return Optional.ofNullable(demoService.getDemoById(id)).map(Demo::toString).orElse("empty String");
    }

    @RequestMapping("/demo/hello/{id}")
    @ResponseBody
    public String test() {

    }
}
