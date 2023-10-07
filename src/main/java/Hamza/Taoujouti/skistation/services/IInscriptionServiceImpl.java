package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Inscription;
import Hamza.Taoujouti.skistation.repositories.IInscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IInscriptionServiceImpl implements IInscriptionService{

    private final IInscriptionRepository inscriptionRepo;
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
}
