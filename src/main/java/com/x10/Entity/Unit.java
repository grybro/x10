package com.x10.Entity;

public class Unit {
    private int id;
    private char houseCode;
    private int unitCode;
    private String name;
    private String description;

    public Unit(int id, char houseCode, int unitCode, String name, String description) {
        this.id = id;
        this.houseCode = houseCode;
        this.unitCode = unitCode;
        this.name = name;
        this.description = description;
    }

    public Unit(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(char houseCode) {
        this.houseCode = houseCode;
    }

    public int getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(int unitCode) {
        this.unitCode = unitCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
