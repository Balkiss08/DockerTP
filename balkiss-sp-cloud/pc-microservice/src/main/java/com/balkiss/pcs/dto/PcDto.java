package com.balkiss.pcs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PcDto {
    private Long id;
    private String nomPc;
    private double prixPc;
    private String marqCode;
    private String nomMarque;
}
