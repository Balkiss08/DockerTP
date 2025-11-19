package com.balkiss.pcs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private PcDto pcDto;
    private MarqueDto marqueDto;
}

