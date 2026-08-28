package ua.pp.darknsoft.cards.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CardsController {

    @GetMapping("/fetch")
    public ResponseEntity<String> getCards() {
        return ResponseEntity.ok("Cards");
    }
}
