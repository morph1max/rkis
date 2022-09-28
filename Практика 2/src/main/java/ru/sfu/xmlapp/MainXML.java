package ru.sfu.xmlapp;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainXML {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContextFile.xml");

        Theatre theatre1 = context.getBean("theatre1", Theatre.class);
        System.out.println(theatre1.getDirector().getInfoDirector());

        Theatre theatre2 = context.getBean("theatre2", Theatre.class);
        System.out.println(theatre2.getDirector().getInfoDirector());

        Theatre theatre3 = context.getBean("theatre3", Theatre.class);
        System.out.println(theatre3.getDirector().getInfoDirector());

        context.close();
    }
}