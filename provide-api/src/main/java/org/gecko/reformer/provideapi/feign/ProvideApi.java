package org.gecko.reformer.provideapi.feign;

import org.gecko.reformer.provideapi.dto.ProvideDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * provide服务api接口
 *
 * @author LZC
 * @version 1.0.0
 * @date 2021/08/23
 **/
public interface ProvideApi {

    /**
     * get方法，通过名称获取数据
     *
     * @param name
     * @return org.gecko.reformer.provideapi.dto.ProvideDTO
     * @author LZC
     * @date 2021/08/23
     * @version 1.0.0
     **/
    @PostMapping("/provide/getProvide")
    ProvideDTO getProvide(@RequestBody String name);

}
