package com.example.swaggerinheritance;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "_petType")
@JsonSubTypes({@JsonSubTypes.Type(Pet.class)})
// @ApiModel(subTypes = {Pet.class})
public abstract class Animal {

    public String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
