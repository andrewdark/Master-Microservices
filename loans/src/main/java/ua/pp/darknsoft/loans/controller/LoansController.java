package ua.pp.darknsoft.loans.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pp.darknsoft.loans.service.ILoansService;


/**
 * Controller for Loan related operations.
 *
 * @author Andrew Dark
 * @since 1.0
 */
@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
public class LoansController {

    private final ILoansService loansService;

    @GetMapping("/fetch")
    public ResponseEntity<String> fetchLoanDetails(){
        return ResponseEntity.ok("Loan details fetched successfully");
    }
}
