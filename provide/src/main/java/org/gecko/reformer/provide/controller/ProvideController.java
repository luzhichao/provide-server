package org.gecko.reformer.provide.controller;

import org.gecko.reformer.provideapi.dto.ProvideDTO;
import org.gecko.reformer.provideapi.feign.ProvideApi;
import org.gecko.reformer.vo.Result;
import org.springframework.web.bind.annotation.*;

/**
 * provide controller
 *
 * @author LZC
 * @version 1.0.0
 * @date 2021/08/23
 **/
@RestController
public class ProvideController implements ProvideApi {

    @Override
    public ProvideDTO getProvide(@RequestBody String name) {
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        ProvideDTO dto = new ProvideDTO();
        dto.setName(name);
        return dto;
    }

    /**
     * 获取名称
     *
     * @param
     * @return org.gecko.reformer.vo.Result<java.lang.String>
     * @author LZC
     * @date 2021/08/23
     * @version 1.0.0
     **/
    @PostMapping("/provide/getName")
    public Result<String> getName() {
        return Result.success("getName方法");
    }
}
