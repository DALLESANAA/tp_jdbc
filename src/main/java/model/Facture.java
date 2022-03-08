package model;

import java.util.Date;

public class Facture {
    private Integer numFacture;
    private Date dateFacture;
    private Integer idClient;

    public Facture(int numFacture, Date date, int idClient) {
        this.numFacture=numFacture;
        this.dateFacture=date;
        this.idClient=idClient;
    }

    public Facture() {

    }

    public Integer getNumFacture() {
        return numFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setNumFacture(Integer numFacture) {
        this.numFacture = numFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    public void afficherFacture(){
        System.out.println("Facture ( id: "+getNumFacture()+" , date: "+getDateFacture()+" , id client: "+getIdClient());
    }
}
