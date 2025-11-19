package com.balkiss.pcs.service;


import com.balkiss.pcs.dto.APIResponseDto;
import com.balkiss.pcs.dto.PcDto;

public interface PcService {
    APIResponseDto getPcById(Long id);
}
