package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;


public class Outfit implements OutfitInterface{
	

  public String color(String colorDress) {
        return "La nouvelle robe est :" + colorDress;
    }

}
