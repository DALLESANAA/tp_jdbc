package service;

import dao.DAOArticle;
import dao.DAOFacture;
import dao.imp.DAOFactureImp;
import model.Facture;

import java.util.List;

public class ServiceFacture {

    DAOFacture daoFacture=new DAOFactureImp();
    public List<Facture> listerFactures(){
        return daoFacture.listerFactures();
    }
    public void ajouterFacture(Facture facture){
        daoFacture.ajouterFacture(facture);
    }

}
