package com.kg.springmvc.web.serverpush;

import com.kg.springmvc.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 描述：servlet3.0 实现服务器数据推送
 * 需要开启 异步支持 dynamic.setAsyncSupported(true);
 *
 * @auther 张圈圈
 * @create 2017-06-14-17:13
 */
@Controller
public class AsyncController {

    @Autowired
    private PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> defer() {
        return pushService.getAsyncUpdate();
    }
}
