package Hamza.Taoujouti.skistation.controllers;

import Hamza.Taoujouti.skistation.entities.Inscription;
import Hamza.Taoujouti.skistation.services.IInscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inscription")
@RequiredArgsConstructor
public class InscriptionController {

    @Qualifier("IInscriptionServiceImpl")
    private final IInscriptionService inscriptionService;

    @PostMapping()
    public Inscription addInscription(@RequestBody Inscription inscription){
        return inscriptionService.addInscription(inscription);
    }

    @GetMapping("{id}")
    public Inscription getInscription(@PathVariable long id){
        return  inscriptionService.getInscription(id);
    }
    @GetMapping()
    public List<Inscription> getAllInscription(){
        return inscriptionService.getAllInscriptions();
    }
    @DeleteMapping("{id}")
    public void deleteInscription(@PathVariable long id){
        inscriptionService.deleteInscription(id);
    }
    @PutMapping("update")
    public Inscription updateInscription(@RequestBody Inscription inscription){
        return inscriptionService.updateInscription(inscription);
    }
    @PostMapping("{id}")
    public  Inscription addInscriptionAndAssignToSkier(@RequestBody Inscription inscription,@PathVariable long id){
        return inscriptionService.addInscriptionAndAssignToSkier(inscription,id)
    }

}
