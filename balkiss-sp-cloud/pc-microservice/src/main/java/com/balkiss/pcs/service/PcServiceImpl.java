package com.balkiss.pcs.service;


import com.balkiss.pcs.dto.APIResponseDto;
import com.balkiss.pcs.dto.MarqueDto;
import com.balkiss.pcs.dto.PcDto;
import com.balkiss.pcs.entities.Pc;
import com.balkiss.pcs.repos.PcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PcServiceImpl implements PcService {
    @Autowired
    private PcRepository pcRepository;
   // private WebClient webClient;
    private APIClient apiClient;
   @Autowired
    public PcServiceImpl(PcRepository pcRepository, APIClient apiClient) {
        this.pcRepository = pcRepository;
        this.apiClient=apiClient;
      //  this.webClient = webClientBuilder.baseUrl("http://localhost:8085").build();
    }
    @Override
    public APIResponseDto getPcById(Long id) {
        Pc pc = pcRepository.findById(id).get();
        MarqueDto marqueDto = apiClient.getMarqueByCode(pc.getMarqCode());
      /*  MarqueDto marqueDto = webClient.get()
                .uri("http://localhost:8085/api/marques/" +
                        pc.getMarqCode())
                .retrieve()
                .bodyToMono(MarqueDto.class)
                .block();*/
        PcDto pcDto = new PcDto(
                pc.getId(),
                pc.getNomPc(),
                pc.getPrixPc(),
                pc.getMarqCode(),
                marqueDto.getNomMarque()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setPcDto(pcDto);
        apiResponseDto.setMarqueDto(marqueDto);
        return apiResponseDto;
    }


}
