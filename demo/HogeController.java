package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HogeController {

    @RequestMapping(value = "/hoge", method = RequestMethod.GET)
    public String getHoge(Model model) {
        model.addAttribute("hoge", new Hoge());
        return "hoge";
    }

}
