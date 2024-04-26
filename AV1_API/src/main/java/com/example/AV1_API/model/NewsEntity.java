package com.example.AV1_API.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "news")
public class NewsEntity {

    @Id
    private String id;
    private String noticias;

    public NewsEntity(){

    }

    public NewsEntity(String id, String noticias) {
        this.id = id;
        this.noticias = noticias;
    }

    public String getId() {
        return id;
    }

    public String getNoticias() {
        return noticias;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }
}
