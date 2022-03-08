package dao.imp;

import dao.ConnectionBD;
import dao.DAOFacture;
import model.Article;
import model.Facture;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOFactureImp implements DAOFacture {
    @Override
    public List<Facture> listerFactures() {
        List<Facture> factures=null;
        String requete="select num_facture, date_facture ,id_client from facture";
        try {
            factures=new ArrayList<>();
            PreparedStatement ps= ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Facture facture=new Facture();
                facture.setNumFacture(rs.getInt(1));
                facture.setDateFacture(rs.getDate(2));
                facture.setIdClient(rs.getInt(3));
                factures.add(facture);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return factures;
    }

    @Override
    public void ajouterFacture(Facture facture) {
        String requete="insert into facture values(?,?,?)";
        try{
            PreparedStatement ps= ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setInt(1,facture.getNumFacture());
            ps.setDate(2, (Date) facture.getDateFacture());
            ps.setInt(3,facture.getIdClient());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Facture> listerFactureParClient(Integer idClient) {
        List<Facture> factures=null;
        String requete="select num_facture, date_facture ,id_client from facture where id_client=?";
        try {
            factures=new ArrayList<>();
            PreparedStatement ps= ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ps.setInt(1,idClient);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Facture facture=new Facture();
                facture.setNumFacture(rs.getInt(1));
                facture.setDateFacture(rs.getDate(2));
                facture.setIdClient(rs.getInt(3));
                factures.add(facture);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return factures;
    }

}
