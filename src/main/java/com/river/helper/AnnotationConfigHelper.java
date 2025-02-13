package com.river.helper;

import com.river.config.AnnotationAppConfig;
import com.river.model.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigHelper {
    public static void demo() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
        Alien alien = context.getBean(Alien.class);
        System.out.println("--------------------------------------------------------------");
//        alien.relax();
//        alien.write();
//        alien.transport();
//        alien.read();
        System.out.println(alien.getAge());
    }
}
