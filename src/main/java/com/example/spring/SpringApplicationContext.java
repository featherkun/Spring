package com.example.spring;

import com.example.spring.annotion.ComponentScan;
import com.example.spring.annotion.Componet;

import java.lang.annotation.Annotation;

public class SpringApplicationContext {

    public SpringApplicationContext(Class clazz) throws Exception {
        if(clazz.isAnnotationPresent(ComponentScan.class)){
            ComponentScan componentScan = (ComponentScan) clazz.getAnnotation(ComponentScan.class);
            String url = componentScan.value();
            if("".equals(url)){
                url = this.getClass().getClassLoader().getResource("com/example/spring").toString();
            }else {

            }
            System.out.println(url);
        }else {
            throw new Exception("没有配置扫描路径");
        }
    }



}
