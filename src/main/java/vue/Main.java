package vue;

import model.Article;
import model.Client;
import model.Facture;
import service.ServiceArticle;
import service.ServiceClient;
import service.ServiceFacture;

import java.io.BufferedReader;
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

           boolean quitter=false;
           while(!quitter){
               displayMenu();

               String option=in.readLine();
               System.out.println("\n");

               if("1".equals(option)) {

               }

           }
       }
    }

    private static void displayMenu() {
    }
}
