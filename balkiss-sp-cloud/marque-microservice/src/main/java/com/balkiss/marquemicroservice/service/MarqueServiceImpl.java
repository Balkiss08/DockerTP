package com.balkiss.marquemicroservice.service;

import com.balkiss.marquemicroservice.dto.MarqueDto;
import com.balkiss.marquemicroservice.entities.Marque;
import com.balkiss.marquemicroservice.repos.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarqueServiceImpl implements MarqueService {
    @Autowired
    MarqueRepository marqueRepository;

    @Override
    public MarqueDto getMarqueByCode(String code) {
        Marque marq = marqueRepository.findByMarqCode(code);
        MarqueDto marqueDto = new MarqueDto(
                marq.getIdMarque(),
                marq.getNomMarque(),
                marq.getMarqCode());


        return marqueDto;
    }

}
