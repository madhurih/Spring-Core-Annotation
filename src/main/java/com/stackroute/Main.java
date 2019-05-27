package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie bean = (Movie) ctx.getBean("Movie.class");
        System.out.println("Movie ID: "+bean.getId());
        System.out.println("Movie Name: "+bean.getMovieName());
        System.out.println("Actor Name: "+bean.getActor().getName());
        System.out.println("Actor Age: "+bean.getActor().getAge());
        System.out.println("Actor Gender: "+bean.getActor().getGender());

        //System.out.println(bean.toString());
        System.out.println("");
        Movie bean1 = (Movie) ctx.getBean("Move.class");
        System.out.println("Movie ID: "+bean1.getId());
        System.out.println("Movie Name: "+bean1.getMovieName());
        System.out.println("Actor Name: "+bean1.getActor().getName());
        System.out.println("Actor Age: "+bean1.getActor().getAge());
        System.out.println("Actor Gender: "+bean1.getActor().getGender());

    }
}