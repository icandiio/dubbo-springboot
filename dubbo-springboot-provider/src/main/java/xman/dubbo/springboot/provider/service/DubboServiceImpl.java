package xman.dubbo.springboot.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import xman.dubbo.springboot.api.IDubboService;

@Service(version = "${service.version}")
public class DubboServiceImpl implements IDubboService {
    @Override
    public String callme(String name) {
        return "callme";
    }
}
