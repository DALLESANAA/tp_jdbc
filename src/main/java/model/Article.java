package model;

public class Article {
    private Integer idArticle;
    private String nom;
    private Double prix;

    public Integer getIdArticle(){
        return idArticle;
    }
    public String getNom(){
        return nom;
    }
    public Double getPrix(){
        return prix;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public void afficherArticle(){
        System.out.println("Article ( id: "+getIdArticle()+" , nom: "+getNom()+" , prix: "+getPrix());
    }
}
