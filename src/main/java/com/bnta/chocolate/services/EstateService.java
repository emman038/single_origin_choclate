package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstateService {
    @Autowired
    EstateRepository estateRepository;


    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

//if we needed the other methods, insert below
    public Estate saveEstate(Estate estate){
        return estateRepository.save(estate);
    }

    public Optional<Estate> getEstateById(Long id){
        return estateRepository.findById(id);
    }

}
