package ru.neoflex.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.practice.model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
}