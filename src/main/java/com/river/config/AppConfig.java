package com.river.config;

import com.river.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    /**
     * Creates a new instance of Alien using the no-argument constructor
     *
     * @return a new instance of Alien
     */
    @Bean(name = {"alien", "alien1", "alien2"})
    public Alien alienBean(Book book, @Qualifier("transport") Transport transport) {
        Alien alien = new Alien();
        alien.setAge(10);
        alien.setBook(book);
        alien.setPen(penBean());
        alien.setTransport(transport);
        return alien;
    }

    @Bean
    @Scope("prototype")
    public Pen penBean() {
        return new Pen();
    }

    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    Transport transport() {
        return new Car();
    }

    @Bean
    @Primary
    Transport transport1() {
        return new Bike();
    }

}
