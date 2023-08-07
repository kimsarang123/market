package com.ll.market;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/index")
    @ResponseBody
    public String index(){
        return "홈화면 입니다.";
    }
}
