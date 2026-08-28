package ua.pp.darknsoft.loans.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class LoansController {

    @GetMapping("/fetch")
    public ResponseEntity<String> fetchLoanDetails(){
        return ResponseEntity.ok("Loan details fetched successfully");
    }
}
