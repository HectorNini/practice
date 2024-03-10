package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.model.Result;
import ru.neoflex.practice.service.CalculationService;

import java.util.List;

@RestController
public class TableController {

    @Autowired
    private CalculationService calculationService;


    @GetMapping("/results")
    public List<Result> getAllResults() {
        return calculationService.getAllResults();
    }


}