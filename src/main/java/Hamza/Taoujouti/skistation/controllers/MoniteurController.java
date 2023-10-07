package Hamza.Taoujouti.skistation.controllers;

import Hamza.Taoujouti.skistation.entities.Moniteur;
import Hamza.Taoujouti.skistation.services.IMoniteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moniteur")
@RequiredArgsConstructor
public class MoniteurController {

    @Qualifier("IMoniteurServiceImpl")
    private final IMoniteurService moniteurService;

    @PostMapping()
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){
        return moniteurService.addMoniteur(moniteur);
    }

    @GetMapping("{id}")
    public Moniteur getMoniteur(@PathVariable long id){
        return  moniteurService.getMoniteur(id);
    }
    @GetMapping()
    public List<Moniteur> getAllMoniteur(){
        return moniteurService.getAllMoniteurs();
    }
    @DeleteMapping("{id}")
    public void deleteMoniteur(@PathVariable long id){
        moniteurService.deleteMoniteur(id);
    }
    @PutMapping("update")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur){
        return moniteurService.updateMoniteur(moniteur);
    }

}
