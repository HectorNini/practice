package ru.neoflex.practice.model;


import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Table(name = "TABLE_NAME")
public class Result {
    private Long id;
    @Setter
    private Integer result;



    public Result() {}
    public Result(Integer result) {
        this.result = result;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "RESULT", nullable = false)
    public Integer getResult() {
        return result;
    }

}