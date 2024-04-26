package com.example.AV1_API.service;

import com.example.AV1_API.model.NewsEntity;
import com.example.AV1_API.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public String consultarUrl(String apiURL){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
            System.out.println(dados);
        }else{
            dados = "Falha ao obter dados, Código de status " + responseEntity.getStatusCode();
        }

        NewsEntity n = new NewsEntity();
        n.setNoticias(dados);
        inserir(n);

        return dados;
    }

    public String consultarNoticiasReleases() {
        return consultarUrl("https://servicodados.ibge.gov.br/api/v3/noticias");
    }

    public String consultarNoticias() {
        return consultarUrl("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }
    public String consultarReleases() {
        return consultarUrl("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");
    }

    public NewsEntity inserir(NewsEntity news) {
        return newsRepository.save(news);
    }

}
