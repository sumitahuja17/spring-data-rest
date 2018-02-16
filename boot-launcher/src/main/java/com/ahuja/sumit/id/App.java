package com.ahuja.sumit.id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Hello world!
 *
 */
@SpringBootApplication (scanBasePackages = "com.ahuja.sumit.id")
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class App extends WebMvcConfigurerAdapter
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        //new SpringApplicationBuilder(App.class).run(args);
        System.out.println( "Hello World!" );
    }
}
