package ru.sfu.annotationapp;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainAnnotation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);

        Theatre theatre1 = context.getBean("beanTheatre1", Theatre.class);
        System.out.println(theatre1.getDirector().getInfoDirector());

        Theatre theatre2 = context.getBean("beanTheatre2", Theatre.class);
        System.out.println(theatre2.getDirector().getInfoDirector());

        context.close();
    }
}