package com.ym.learn.stream.pojo;

public class Dog {

    private String color;
    private Integer weight ;
    private Double price ;

    public Dog() {
    }

    public Dog(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Dog(String color, Integer weight, Double price) {
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
