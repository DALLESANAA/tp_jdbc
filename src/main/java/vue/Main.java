package vue;

import model.Article;
import model.Client;
import model.Facture;
import service.ServiceArticle;
import service.ServiceClient;
import service.ServiceFacture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
       try{
           InputStreamReader converter=new InputStreamReader(System.in);
           BufferedReader in=new BufferedReader(converter);
           ServiceArticle serviceArticle=new ServiceArticle();
           ServiceFacture serviceFacture=new ServiceFacture();

           boolean quitter=false;
           while(!quitter){
               displayMenu();

               String option=in.readLine();
               System.out.println("\n");

               if("1".equals(option)) {
                   List<Article> articles=serviceArticle.listerArticles();
                   for(Article article:articles){
                       article.afficherArticle();
                   }
               }else if("2".equals(option)){
                   List<Facture> factures=serviceFacture.listerFactures();
                   for(Facture facture:factures){
                       facture.afficherFacture();
                   }
               }else if("3".equals(option)){
                Date date= (Date) new SimpleDateFormat("yyyy/mm/dd").parse("08/03/2022");
                 Facture facture1 = new Facture(1,date,1);
                 serviceFacture.ajouterFacture(facture1);
               }
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    private static void displayMenu() {
        System.out.println("Choisir une option");
        System.out.println("\t1 - Lister Les Articles");
        System.out.println("\t2 - Lister Les Factures");
        System.out.println("\t3 - Creer une facture pour un client");
        System.out.println("\tautre - quitter");
    }
}
