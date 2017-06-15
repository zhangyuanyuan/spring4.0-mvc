package com.kg.springmvc.web.serverpush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * 描述： Server Send Event 方式 提供服务器端的数据推送
 * 需要客户端浏览器的支持 window.EventSource
 * @auther 张圈圈
 * @create 2017-06-14-16:53
 */
@Controller
public class SSEController {

    @RequestMapping(value = "/push", produces = "text/event-stream")
    @ResponseBody
    public String push() {
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "data:Testing :" + r.nextInt() + "\n\n";
    }
}
