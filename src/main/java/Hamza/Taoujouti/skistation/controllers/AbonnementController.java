package Hamza.Taoujouti.skistation.controllers;

import Hamza.Taoujouti.skistation.entities.Abonnement;
import Hamza.Taoujouti.skistation.services.IAbonnementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abonnement")
@RequiredArgsConstructor
public class AbonnementController {

    @Qualifier("IAbonnementServiceImpl")
    private final IAbonnementService abonnementService;

    @PostMapping()
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.addAbonnement(abonnement);
    }

    @GetMapping("{id}")
    public Abonnement getAbonnement(@PathVariable long id){
        return  abonnementService.getAbonnement(id);
    }
    @GetMapping()
    public List<Abonnement> getAllAbonnement(){
        return abonnementService.getAllAbonnements();
    }
    @DeleteMapping("{id}")
    public void deleteAbonnement(@PathVariable long id){
        abonnementService.deleteAbonnement(id);
    }
    @PutMapping("update")
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.updateAbonnement(abonnement);
    }

}
