package pres;

import dao.Idao;
import metier.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class<?> cDao= Class.forName(daoClassName);
        Idao dao=(Idao)cDao.getConstructor().newInstance();
        System.out.println(dao.getData());


        String metierClassName=scanner.nextLine();
        Class<?> cmet= Class.forName(metierClassName);
        Imetier metier=(Imetier) cmet.getConstructor(Idao.class).newInstance(dao);

        //Method setDao=cmet.getDeclaredMethod("setDao",Idao.class);
        //setDao.invoke(metier,dao);
        System.out.println("res"+metier.calcul());

    }

}
