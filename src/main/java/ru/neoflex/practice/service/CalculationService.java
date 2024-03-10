package ru.neoflex.practice.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.practice.model.Result;
import ru.neoflex.practice.repository.ResultRepository;

import java.util.List;


@Service
public class CalculationService {

    @Autowired
    private ResultRepository resultRepository;


    public void saveResult(Integer result) {

        resultRepository.saveAndFlush(new Result(result));
    }

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }
}
