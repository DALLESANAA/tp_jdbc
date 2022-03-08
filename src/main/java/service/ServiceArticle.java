package service;

import dao.DAOArticle;
import dao.imp.DAOArticleImp;
import model.Article;

import java.util.List;

public class ServiceArticle {
    DAOArticle daoArticle=new DAOArticleImp();
    public List<Article> listerArticles(){
        return daoArticle.listerArticles();
    }
}
