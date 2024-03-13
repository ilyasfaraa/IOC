package metier;

import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class metierImpl implements Imetier {

    private Idao dao;
    public metierImpl(Idao dao){
        this.dao =dao;
    }
    @Override
    public double calcul() {
        double d= dao.getData();
        double res=d*11.4;
        return res;
    }
    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
