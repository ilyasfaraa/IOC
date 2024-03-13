package pres;

import metier.Imetier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presavecSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = (Imetier) springContext.getBean("metier");
        System.out.println(metier.calcul());
    }
}