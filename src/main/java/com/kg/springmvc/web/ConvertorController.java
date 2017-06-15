package com.kg.springmvc.web;

import com.kg.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：
 *
 * @auther 张圈圈
 * @create 2017-06-14-16:11
 */
@Controller
public class ConvertorController {

    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    @ResponseBody
    public DemoObj convertor(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
