package com.balkiss.marquemicroservice.service;

import com.balkiss.marquemicroservice.dto.MarqueDto;

public interface MarqueService {
    MarqueDto getMarqueByCode (String code);
}
