package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Cours;
import Hamza.Taoujouti.skistation.entities.Inscription;
import Hamza.Taoujouti.skistation.entities.Skieur;
import Hamza.Taoujouti.skistation.repositories.ICoursRepository;
import Hamza.Taoujouti.skistation.repositories.IInscriptionRepository;
import Hamza.Taoujouti.skistation.repositories.ISkieurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IInscriptionServiceImpl implements IInscriptionService{

    private final IInscriptionRepository inscriptionRepo;
    private final ISkieurRepository skieurRepo;
    private final ICoursRepository coursRepo;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public void deleteInscription(Long inscriptionId) {
        inscriptionRepo.deleteById(inscriptionId);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        Assert.notNull(inscription.getId(),"inscription Id must not be null");
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription getInscription(Long inscriptionId) {
        return inscriptionRepo.findById(inscriptionId).orElse(null);
    }

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepo.findAll();
    }

    @Override
    public  Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long idSkier){
        Skieur skieur = skieurRepo.findById(idSkier).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription assignInscriptionToCours(Long idInscription, Long idCours){
        Cours cours = coursRepo.findById(idCours).orElse(null);
        Inscription inscription = inscriptionRepo.findById(idInscription).orElse(null);
        Assert.notNull(cours,"cours must not be null");
        Set<Inscription> inscriptions =  cours.getInscriptions();
        inscriptions.add(inscription);
        cours.setInscriptions(inscriptions);
        coursRepo.save(cours);
        return inscription;
    }
}
