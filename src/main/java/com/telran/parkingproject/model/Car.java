package com.telran.parkingproject.model;


import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "year_of_production")
    private int yearOfProduction;
    @Column(name = "color")
    private String color;

    public Car(String name, int year, int id, String color) {
        this.name = name;
        this.yearOfProduction = year;
        this.id = id;
        this.color = color;
    }

    public Car() {
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int year) {
        this.yearOfProduction = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
