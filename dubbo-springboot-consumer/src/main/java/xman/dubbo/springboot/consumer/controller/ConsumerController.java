package xman.dubbo.springboot.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xman.dubbo.springboot.api.IDubboService;

@RestController
public class ConsumerController {

    @Reference(version = "${service.version}")
    private IDubboService dubboService;

    @RequestMapping("/callme/{name}")
    public String callme(@PathVariable("name") String name) {
        return dubboService.callme(name);
    }

}
