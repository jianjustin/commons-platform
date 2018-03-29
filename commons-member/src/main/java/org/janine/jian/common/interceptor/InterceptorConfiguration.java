package org.janine.jian.common.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器栈注册
 * @author jian
 *
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter{

	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        InterceptorRegistration ir = registry.addInterceptor(new ActionIntercetor());
        // 配置拦截的路径
        ir.addPathPatterns("/**");

    }

}
