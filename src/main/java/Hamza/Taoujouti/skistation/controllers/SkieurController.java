package Hamza.Taoujouti.skistation.controllers;

import Hamza.Taoujouti.skistation.entities.Skieur;
import Hamza.Taoujouti.skistation.services.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieurController {
    @Qualifier("ISkieurServiceImpl")
    private final ISkieurService skieurService;

    @PostMapping()
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }
    @GetMapping("{id}")
    public Skieur getSkieur(@PathVariable long id){
        return  skieurService.getSkieur(id);
    }
    @GetMapping()
    public List<Skieur> getAllSkieur(){
        return skieurService.getAllSkieurs();
    }
    @DeleteMapping("{id}")
    public void deleteSkieur(@PathVariable long id){
        skieurService.deleteSkieur(id);
    }
    @PutMapping("update")
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return skieurService.updateSkieur(skieur);
    }
    @PostMapping("/assignSkieurToPiste/{idSkieur}/{idPiste}")
    public Skieur assignSkieurToPiste(@PathVariable long idSkieur,@PathVariable long idPiste){
        return skieurService.assignSkieurToPiste(idSkieur,idPiste);
    }
}
