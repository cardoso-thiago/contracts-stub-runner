package br.com.contracts.controller;

import br.com.contracts.dto.KeyDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationKeyController {

    @PutMapping("/configuration/v1/key")
    public ResponseEntity<KeyDto> addConfig(@RequestBody KeyDto key) {
        //Adiciona na base
        return new ResponseEntity<>(key, HttpStatus.OK);
    }
}
