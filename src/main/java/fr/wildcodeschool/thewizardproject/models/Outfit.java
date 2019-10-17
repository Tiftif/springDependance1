package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;


public class Outfit implements OutfitInterface{
	

  public String changeDress(String dress) {
        return "The wizard's dress is blue" + dress;
    }

}
