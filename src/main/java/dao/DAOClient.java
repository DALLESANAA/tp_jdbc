package dao;

import model.Client;

import java.util.List;

public interface DAOClient {
    public void ajouterClient(Client client);
    public void modifierClient(Integer idClient, String nom, String prenom);

}
