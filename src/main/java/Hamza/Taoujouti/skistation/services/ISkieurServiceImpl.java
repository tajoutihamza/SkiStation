package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Skieur;
import Hamza.Taoujouti.skistation.repositories.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISkieurServiceImpl implements ISkieurService{
    @Autowired
    private ISkieurRepository skieurRepo;

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
}
