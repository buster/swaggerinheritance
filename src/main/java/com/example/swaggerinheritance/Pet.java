package com.example.swaggerinheritance;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "_petType")
@JsonSubTypes({@JsonSubTypes.Type(Cat.class)})
//@ApiModel(parent = Animal.class, subTypes = Cat.class, discriminator = "petType")
public abstract class Pet extends Animal {
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String petName;
}
