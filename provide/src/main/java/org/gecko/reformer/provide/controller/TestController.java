package org.gecko.reformer.provide.controller;

import org.gecko.reformer.provideapi.feign.TestApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author LZC
 * @version 1.0.0
 * @date 2021/08/27
 **/
@RestController
public class TestController implements TestApi {

    @Override
    public String getStrName() {
        return "调用了TestController==>getStrName()";
    }
}
