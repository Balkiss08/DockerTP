package com.balkiss.marquemicroservice.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarqueDto {
    private Long idMarque;
    private String nomMarque;
    private String marqCode;
}