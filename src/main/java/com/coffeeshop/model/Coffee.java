package com.coffeeshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity  // Эта аннотация говорит, что класс является сущностью для базы данных
public class Coffee {

    @Id  // Уникальный идентификатор для каждого объекта
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Автоматическое генерирование идентификаторов
    private Long id;

    private String name;  // Название кофе
    private Double price;  // Цена кофе

    // Конструкторы, геттеры и сеттеры
    public Coffee() {}

    public Coffee(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}