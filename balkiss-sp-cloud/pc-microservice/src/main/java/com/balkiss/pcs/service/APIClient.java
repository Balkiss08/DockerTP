package com.balkiss.pcs.service;

import com.balkiss.pcs.dto.MarqueDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(url = "http://localhost:8085", value = "Marque")
//@FeignClient(value = "MARQUE", fallback = MarqueFallback.class)

@FeignClient(value = "MARQUE")
public interface APIClient {
    @GetMapping("/api/marques/{marque-code}")
    MarqueDto getMarqueByCode(@PathVariable("marque-code")
                               String marqueCode
    );
}