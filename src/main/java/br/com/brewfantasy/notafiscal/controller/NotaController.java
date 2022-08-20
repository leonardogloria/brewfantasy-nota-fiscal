package br.com.brewfantasy.notafiscal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;

@RestController
@RequestMapping
public class NotaController {
    private static final Logger LOGGER = Logger.getLogger( NotaController.class.getName() );

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, String>> generateNota(@PathVariable Long id) {
        int probabilidade = new Random().nextInt(3000);
        if (probabilidade > 2500) {
            System.out.println("Internal server error");
            return ResponseEntity.internalServerError().body(Map.of("message", "internal server error"));
        }
        return ResponseEntity.ok(Map.of("message", "sucesso"));
    }

    @GetMapping("/circuit")
    public ResponseEntity<Map<String, String>> circuit() {
        return ResponseEntity.ok(Map.of("message", "sucesso"));
    }
    @GetMapping("/nota/{id}")
    public ResponseEntity<Map<String, String>> nota(@PathVariable Integer id) {
        if(id > 4000){
            LOGGER.info("Execption CALLED wuth " + id);
            return ResponseEntity.internalServerError().body(Map.of("message", "sucesso"));
        }
        return ResponseEntity.ok(Map.of("message", "sucesso"));
    }
}
