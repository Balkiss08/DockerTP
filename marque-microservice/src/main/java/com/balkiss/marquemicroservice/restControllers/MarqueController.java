package com.balkiss.marquemicroservice.restControllers;

import com.balkiss.marquemicroservice.config.Configuration;
import com.balkiss.marquemicroservice.dto.MarqueDto;
import com.balkiss.marquemicroservice.service.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
@RestController
@RequestMapping("/api/marques")
public class MarqueController {
    private MarqueService marqueService;

    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;

    public MarqueController(MarqueService marqueService) {
        this.marqueService = marqueService;

    }

    @GetMapping("{code}")
    public ResponseEntity<MarqueDto> getMarqueByCode(@PathVariable("code")
                                                     String code) {
        return new ResponseEntity<MarqueDto>(
                marqueService.getMarqueByCode(code),
                HttpStatus.OK);
    }

    @GetMapping("/version")
    public ResponseEntity<String> version() {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName() + " " + configuration.getEmail());

    }
}