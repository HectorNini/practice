package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.service.CalculationService;

@RestController
public class CalcController {

    @Autowired
    private CalculationService calculationService;

    @GetMapping("/plus/{a}/{b}")
    public Integer CalculateSum(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        Integer result = a + b;
        calculationService.saveResult(result);
        return result;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer CalculateDiff(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        Integer result = a - b;
        calculationService.saveResult(result);
        return result;
    }
}