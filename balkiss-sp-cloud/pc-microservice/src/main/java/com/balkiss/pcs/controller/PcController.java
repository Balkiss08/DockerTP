package com.balkiss.pcs.controller;


import com.balkiss.pcs.dto.APIResponseDto;
import com.balkiss.pcs.dto.PcDto;
import com.balkiss.pcs.service.PcService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/pcs")
@AllArgsConstructor

public class PcController {
    private PcService pcService;
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getPcById(@PathVariable("id")
                                                         Long id )
    {
        return new ResponseEntity<APIResponseDto>(pcService.getPcById(id), HttpStatus.OK);
    }



}
