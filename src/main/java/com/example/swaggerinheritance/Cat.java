package com.example.swaggerinheritance;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;

@JsonTypeName("Cat")
// @ApiModel(parent = Pet.class)
public class Cat extends Pet {
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String catName;
}
