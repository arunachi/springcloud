package com.foo.springcloud.provider.chongqing.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class CompanyFallbackFactory implements FallbackFactory<CompanyFeign> {
    @Override
    public CompanyFeign create(Throwable throwable) {
        return () -> "";
    }
}
