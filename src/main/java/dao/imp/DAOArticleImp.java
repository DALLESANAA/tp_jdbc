package dao.imp;

import dao.ConnectionBD;
import dao.DAOArticle;
import model.Article;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOArticleImp implements DAOArticle {
    @Override
    public List<Article> listerArticles() {
        List<Article> articles=null;
        String requete="select id_article,nom,prix from article";
        try {
            articles=new ArrayList<>();
            PreparedStatement ps= ConnectionBD.getInstance().getConnection().prepareStatement(requete);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Article article=new Article();
                article.setIdArticle(rs.getInt(1));
                article.setNom(rs.getString(2));
                article.setPrix(rs.getDouble(3));
                articles.add(article);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return articles;
    }
}
