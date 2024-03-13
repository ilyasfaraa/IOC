package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.Imetier;
import metier.metierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImpl  dao=new DaoImpl();
        metierImpl metier=new metierImpl(dao);
        //metier.setDao(dao);
        System.out.println("res="+metier.calcul());

    }
}
