package com.br1.sfgpetclinic.services;

import com.br1.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();

}
