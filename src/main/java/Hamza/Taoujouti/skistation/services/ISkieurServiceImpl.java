package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Piste;
import Hamza.Taoujouti.skistation.entities.Skieur;
import Hamza.Taoujouti.skistation.repositories.IPisteRepository;
import Hamza.Taoujouti.skistation.repositories.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Set;

@Service
public class ISkieurServiceImpl implements ISkieurService{
    @Autowired
    private ISkieurRepository skieurRepo;
    @Autowired
    private IPisteRepository pisteRepo;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public void deleteSkieur(Long skieurId) {
        skieurRepo.deleteById(skieurId);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public Skieur getSkieur(Long skieurId) {
        return skieurRepo.findById(skieurId).orElse(null);
    }

    @Override
    public List<Skieur> getAllSkieurs() {
        return (List<Skieur>) skieurRepo.findAll();
    }

    @Override
    public Skieur assignSkieurToPiste(Long idSkieur, Long idPiste) {
        Skieur skieur = skieurRepo.findById(idSkieur).orElse(null);
        Piste piste = pisteRepo.findById(idPiste).orElse(null);
        Assert.notNull(piste,"piste must not be null");
        Set<Skieur> skieurs = piste.getSkieurs();
        skieurs.add(skieur);
        piste.setSkieurs(skieurs);
        pisteRepo.save(piste);
        return skieur;
    }
}
