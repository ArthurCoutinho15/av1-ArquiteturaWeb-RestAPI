package com.example.AV1_API.controller;

import com.example.AV1_API.model.NewsEntity;
import com.example.AV1_API.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ComparisonOperators;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/noticias")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/noticiasereleases")
    public String consultarNoticiasReleases(){
        return newsService.consultarNoticiasReleases();
    }
    @GetMapping("/releases")
    public String consultarReleases(){
        return newsService.consultarReleases();
    }

    @GetMapping("/noticias")
    public String consultarNoticias(){
        return newsService.consultarNoticias();
    }

}
