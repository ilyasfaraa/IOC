package ext;

import dao.Idao;

public class DaoImplvCapteur implements Idao {
    @Override
    public double getData() {
        System.out.println("version capteur");
        double da=77;
        return da;
    }
}
