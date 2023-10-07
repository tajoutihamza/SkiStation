package Hamza.Taoujouti.skistation.controllers;

import Hamza.Taoujouti.skistation.entities.Piste;
import Hamza.Taoujouti.skistation.services.IPisteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("piste")
@RequiredArgsConstructor
public class PisteController {

    @Qualifier("IPisteServiceImpl")
    private final IPisteService pisteService;

    @PostMapping()
    public Piste addPiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }

    @GetMapping("{id}")
    public Piste getPiste(@PathVariable long id){
        return  pisteService.getPiste(id);
    }
    @GetMapping()
    public List<Piste> getAllPiste(){
        return pisteService.getAllPistes();
    }
    @DeleteMapping("{id}")
    public void deletePiste(@PathVariable long id){
        pisteService.deletePiste(id);
    }
    @PutMapping("update")
    public Piste updatePiste(@RequestBody Piste piste){
        return pisteService.updatePiste(piste);
    }

}
