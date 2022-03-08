package service;

import dao.DAOClient;
import dao.imp.DAOClientImp;
import model.Client;

public class ServiceClient {
    DAOClient dao=new DAOClientImp();
    public void ajouterClient(Client client){
        dao.ajouterClient(client);
    }
}
