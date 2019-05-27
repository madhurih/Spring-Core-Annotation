package com.stackroute.config;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration
{
    //configure any bean here
    @Bean(name = "Movie.class")
    public Movie getMovie()
    {
//        Actor actor=new Actor();
//        actor.setName("Madhuri");
//        actor.setAge(30);
//        actor.setGender("F");

//        Movie movie=new Movie(actor);
//        movie.setMovieName("kalank");
//        movie.setId(01);
        //movie.setActor(actor);
        Movie movie = new Movie(1, "kalank");
        return movie;
    }
    @Bean
    public Actor getActor() {
        Actor actor = new Actor("Madhuri", "F", 30);
        return actor;
    }

    @Bean(name = "BeanLifecycleDemoBean")
    public BeanLifecycleDemoBean getBeanLifecycleDemoBean()
    {
        BeanLifecycleDemoBean beanLifecycleDemoBean = new BeanLifecycleDemoBean();
        beanLifecycleDemoBean.setMessage("Hello world");
        return beanLifecycleDemoBean;
    }

    @Bean(name = "BeanPostProcessorDemoBean")
    public BeanPostProcessorDemoBean getBeanPostProcessorDemoBean()
    {
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = new BeanPostProcessorDemoBean();
        return beanPostProcessorDemoBean;
    }
}