package com.redspade.JavaConfigBean.config;


import com.redspade.JavaConfigBean.common.Coach;
import com.redspade.JavaConfigBean.common.SwimmingCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("myBeanId")
    public Coach swimmingCoach(){
        return new SwimmingCoach();
    }
}
