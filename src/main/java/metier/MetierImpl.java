package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; //Couplage faible
    @Override
    public double calcul() {
        double d =dao.getData();
        double res = d*13;
        return res;
    }

    /*
    Pour injecter dans la variable dao un objet de type IDao
    càd un objet d'une classe qui implémente IDao
     */

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
