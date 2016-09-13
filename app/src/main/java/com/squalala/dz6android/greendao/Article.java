package com.squalala.dz6android.greendao;

import java.util.List;
import com.squalala.dz6android.greendao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ARTICLE".
 */
public class Article {

    private Long id;
    /** Not-null value. */
    private String title;
    /** Not-null value. */
    private String content;
    private String urlImage;
    private String link;
    private String author;
    private Boolean status;
    private Boolean deleted;
    private Boolean favoris;
    private java.util.Date date;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ArticleDao myDao;

    private List<CategoryArticle> articles;

    public Article() {
    }

    public Article(Long id) {
        this.id = id;
    }

    public Article(Long id, String title, String content, String urlImage, String link, String author, Boolean status, Boolean deleted, Boolean favoris, java.util.Date date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.urlImage = urlImage;
        this.link = link;
        this.author = author;
        this.status = status;
        this.deleted = deleted;
        this.favoris = favoris;
        this.date = date;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getArticleDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getTitle() {
        return title;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTitle(String title) {
        this.title = title;
    }

    /** Not-null value. */
    public String getContent() {
        return content;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getFavoris() {
        return favoris;
    }

    public void setFavoris(Boolean favoris) {
        this.favoris = favoris;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<CategoryArticle> getArticles() {
        if (articles == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CategoryArticleDao targetDao = daoSession.getCategoryArticleDao();
            List<CategoryArticle> articlesNew = targetDao._queryArticle_Articles(id);
            synchronized (this) {
                if(articles == null) {
                    articles = articlesNew;
                }
            }
        }
        return articles;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetArticles() {
        articles = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}