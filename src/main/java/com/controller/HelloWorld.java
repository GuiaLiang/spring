package com.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by root on 2016/6/29.
 */
@Controller
@RequestMapping({"index"})
public class HelloWorld {
    //查看课程列表
    @RequestMapping(value = "/test")
    @ResponseBody
    public String subject(HttpServletResponse response) {
        return "HelloWorld";
    }

}
