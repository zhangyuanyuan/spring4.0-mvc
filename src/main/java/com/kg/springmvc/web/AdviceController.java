package com.kg.springmvc.web;

import com.kg.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-14-14:47
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("other-msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("这个提示信息从 ModelAttribute 中取得：" + msg
                + "; obj中的id是否绑定：" + obj.getId() + "; obj中name是绑定:" + obj.getName());
    }
}
