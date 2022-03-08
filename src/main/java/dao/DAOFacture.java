package dao;

import model.Facture;
import java.util.List;

public interface DAOFacture {
    public List<Facture> listerFactures();
    public void ajouterFacture(Facture facture);
    public List<Facture> listerFactureParClient(Integer idClient);
}
