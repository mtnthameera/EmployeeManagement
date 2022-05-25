package com.nipun.employee.management.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Nipun on 23/5/22
 */


@Configuration
@EnableWebMvc
@ComponentScan("com.nipun.employee.management")
public class WebMvcConfig {
}
