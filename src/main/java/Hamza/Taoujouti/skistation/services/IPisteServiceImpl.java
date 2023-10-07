package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Piste;
import Hamza.Taoujouti.skistation.repositories.IPisteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IPisteServiceImpl implements IPisteService{

    private final IPisteRepository pisteRepo;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public void deletePiste(Long pisteId) {
        pisteRepo.deleteById(pisteId);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        Assert.notNull(piste.getId(),"piste Id must not be null");
        return pisteRepo.save(piste);    }

    @Override
    public Piste getPiste(Long pisteId) {
        return pisteRepo.findById(pisteId).orElseThrow(() -> new IllegalArgumentException("No piste found with this Id"));
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepo.findAll();
    }
}
