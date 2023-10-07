package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Piste;

import java.util.List;

public interface IPisteService {
    public Piste addPiste(Piste piste);
    public void deletePiste(Long pisteId);
    public Piste updatePiste(Piste piste);
    public Piste getPiste(Long pisteId);
    public List<Piste> getAllPistes();
}
