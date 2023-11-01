package br.edu.fatec.mvcDemo.controllers;

import br.edu.fatec.mvcDemo.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/albuns")
public class AlbumController {
    private static final List<Album> albuns = new ArrayList<Album>();

    public AlbumController(){
        albuns.add(new Album("Post","Bjork",100));
        albuns.add(new Album("Ray of Light","Madonna",80));
        albuns.add(new Album("Renaissance","Beyonce",90));
    }
    @GetMapping
    public String getAlbuns(Model model){
        model.addAttribute("albuns", albuns);
        return "albuns";
    }
}
