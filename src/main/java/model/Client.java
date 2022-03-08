package model;

public class Client {
    private Integer idClient;
    private String nom;
    private String prenom;

    public Client(int idClient, String nom, String prenom) {
        this.idClient=idClient;
        this.nom=nom;
        this.prenom=prenom;
    }

    public Integer getIdClient(){
        return idClient;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setIdClient(int anInt){
        this.idClient=idClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
