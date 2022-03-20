package com.lys.emsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

@RestController
@RequestMapping("/test")
public class DemoController {
    @GetMapping
    public String test(HttpServletRequest rq) {
        rq.getSession().setAttribute("name", "李明");
        return "hello,EMSystem";
    }

    @GetMapping("/get")
    public String test1(HttpServletRequest rq) {
        String name = String.valueOf(rq.getSession().getAttribute("name"));
        return name;
    }
}
