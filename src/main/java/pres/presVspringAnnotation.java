package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presVspringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("metier","ext");
        Imetier metier=context.getBean(Imetier.class);
        System.out.println("RES="+metier.calcul());

    }
}
