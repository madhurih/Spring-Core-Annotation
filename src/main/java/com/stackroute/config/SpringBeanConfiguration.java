package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration
{
    //configure any bean here
    @Bean(name = "Movie.class")
    @Scope("prototype")
    public Movie getMovie()
    {
//        Actor actor=new Actor();
//        actor.setName("Madhuri");
//        actor.setAge(30);
//        actor.setGender("F");
//
//        Movie movie=new Movie(actor);
//        movie.setMovieName("kalank");
//        movie.setId(01);
//        movie.setActor(actor);
        Actor actor = new Actor("Madhuri", "F", 30);
        Movie movie = new Movie(1, "kalank", actor);
        return movie;
    }

    @Bean(name = "Move.class")
    public Movie getMove()
    {
//        Actor actor=new Actor();
//        actor.setName("varun");
//        actor.setAge(30);
//        actor.setGender("M");
//
//        Movie movie=new Movie(actor);
//        movie.setMovieName("Student of the year");
//        movie.setId(02);
//        movie.setActor(actor);
        Actor actor = new Actor("Madhuri", "F", 30);
        Movie movie = new Movie(1, "kalank", actor);
        return movie;
    }
}