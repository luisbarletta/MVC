package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/albuns")
public class DadosController {

    private static final List<Album> albuns = new ArrayList<Album>();

    public DadosController(){
        albuns.add(new Album("Post","Bjork",100));
        albuns.add(new Album("Ray of Light","Madonna",80));
        albuns.add(new Album("Renaissance","Beyonce",90));
    }

    @GetMapping
    public List<Album> getAlbuns(){
        return albuns;
    }
}
