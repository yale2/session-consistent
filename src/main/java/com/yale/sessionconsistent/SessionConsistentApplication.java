package com.yale.sessionconsistent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author yale
 */
@SpringBootApplication
@EnableRedisHttpSession
public class SessionConsistentApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SessionConsistentApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(SessionConsistentApplication.class, args);
    }

}
