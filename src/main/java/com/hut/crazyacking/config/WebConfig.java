/*
package com.hello.config;


import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.dialect.SpringStandardDialect;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.StandardTemplateModeHandlers;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import java.nio.charset.Charset;
import java.util.*;

*/
/**
* @author : crazyacking
* @date : 2015/12/18
*//*


@Configuration
@ComponentScan({"com.hello"})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        converters.add(stringHttpMessageConverter());
        converters.add(fastJsonHttpMessageConverter());
        restTemplate.setMessageConverters(converters);
        return restTemplate;
    }

    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return stringHttpMessageConverter;
    }


    public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        return fastJsonHttpMessageConverter;
    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(stringHttpMessageConverter());
        converters.add(fastJsonHttpMessageConverter());
        super.configureMessageConverters(converters);
    }


    @Bean
    public TemplateResolver templateResolver() {
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(StandardTemplateModeHandlers.HTML5.getTemplateModeName());
        resolver.setCharacterEncoding("UTF-8");
        resolver.setCacheable(false);
        return resolver;
    }


    @Bean
    public SpringTemplateEngine templateEngine() {
        Set<IDialect> additionalDialects = new HashSet<>();
        additionalDialects.add(new SpringStandardDialect());
        additionalDialects.add(new ShiroDialect());
        additionalDialects.add(new LayoutDialect());
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
        engine.setAdditionalDialects(additionalDialects);
        return engine;
    }

    @Bean
    public ContentNegotiationManager contentNegotiationManager() {
        ContentNegotiationManagerFactoryBean contentNegotiationManager = new ContentNegotiationManagerFactoryBean();
        Properties mediaTypes = new Properties();
        mediaTypes.put("json", MediaType.APPLICATION_JSON_VALUE);
        mediaTypes.put("html", MediaType.TEXT_HTML_VALUE);

        contentNegotiationManager.setMediaTypes(mediaTypes);
        contentNegotiationManager.setDefaultContentType(MediaType.TEXT_HTML);
        contentNegotiationManager.setIgnoreAcceptHeader(true);
        return contentNegotiationManager.getObject();
    }

    @Bean
    public ViewResolver contentNegotiatingViewResolver() {
        ContentNegotiatingViewResolver viewResolver = new ContentNegotiatingViewResolver();
        viewResolver.setOrder(1);
        viewResolver.setContentNegotiationManager(contentNegotiationManager());

        List<ViewResolver> viewResolvers = new ArrayList<>();
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine(templateEngine());
        thymeleafViewResolver.setCharacterEncoding("UTF-8");
        viewResolvers.add(thymeleafViewResolver);
        viewResolver.setViewResolvers(viewResolvers);

        List<View> defaultViews = new ArrayList<>();
        defaultViews.add(new FastJsonJsonView());

        viewResolver.setDefaultViews(defaultViews);

        return viewResolver;
    }
}

*/
