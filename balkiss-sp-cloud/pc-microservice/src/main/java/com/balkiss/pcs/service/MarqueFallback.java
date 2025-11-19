package com.balkiss.pcs.service;

import com.balkiss.pcs.dto.MarqueDto;
import org.springframework.stereotype.Component;

@Component
public class MarqueFallback implements APIClient {

        @Override
        public MarqueDto getMarqueByCode(String marqueCode) {
         return null;
        }
    }


