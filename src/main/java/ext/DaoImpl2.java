package ext;

import dao.Idao;
import org.springframework.stereotype.Component;

import java.net.StandardSocketOptions;
@Component
public class DaoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("version WS");
        double data=55;
        return data;
    }
}
