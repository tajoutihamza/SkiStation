package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    public Inscription addInscription(Inscription inscription);
    public void deleteInscription(Long inscriptionId);
    public Inscription updateInscription(Inscription inscription);
    public Inscription getInscription(Long inscriptionId);
    public List<Inscription> getAllInscriptions();
}
