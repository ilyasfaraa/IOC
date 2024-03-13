package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements Idao {
    @Override
    public double getData() {
        System.out.println("version BD");
        double data = 34;
        return data;
    }
}
