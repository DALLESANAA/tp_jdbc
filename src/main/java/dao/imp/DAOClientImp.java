package dao.imp;

import dao.ConnectionBD;
import dao.DAOClient;
import model.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOClientImp implements DAOClient {
    public void ajouterClient(Client client){
       String requete="insert into client values(?,?,?)";
       try{
           PreparedStatement ps= ConnectionBD.getInstance().getConnection().prepareStatement(requete);
           ps.setInt(1,client.getIdClient());
           ps.setString(2,client.getNom());
           ps.setString(3,client.getPrenom());
           ps.executeUpdate();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
    public void modifierClient(Integer idClient, String nom, String prenom){
        String requete="update client set nom=? , prenom=? where id_client =?";
        try{
            PreparedStatement ps=ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setString(1,nom);
            ps.setString(2,prenom);
            ps.setInt(3,idClient);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
