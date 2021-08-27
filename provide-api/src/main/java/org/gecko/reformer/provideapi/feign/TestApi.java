package org.gecko.reformer.provideapi.feign;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试Api
 *
 * @author LZC
 * @version 1.0.0
 * @date 2021/08/23
 **/
public interface TestApi {

    @RequestMapping("/test/getStrName")
    String getStrName();

}
