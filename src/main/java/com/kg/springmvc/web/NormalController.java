package com.kg.springmvc.web;

import com.kg.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-14-17:33
 */
@Controller
public class NormalController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/normal")
    public String normalPage(Model model) {
        model.addAttribute("msg", demoService.saySomething());
        return "normal";
    }

    @RequestMapping("/api/normal")
    @ResponseBody
    public String normalRest() {
        return demoService.saySomething();
    }
}
