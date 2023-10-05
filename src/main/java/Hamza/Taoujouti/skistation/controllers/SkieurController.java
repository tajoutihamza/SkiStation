package Hamza.Taoujouti.skistation.controllers;

import Hamza.Taoujouti.skistation.entities.Skieur;
import Hamza.Taoujouti.skistation.services.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SkieurController {
    @Qualifier("ISkieurServiceImpl")
    private ISkieurService skieurService;

    @PostMapping()
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }
}
