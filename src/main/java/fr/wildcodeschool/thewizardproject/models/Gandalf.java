package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;


public class Gandalf implements WizardInterface {
	private OutfitInterface dress;

	@Override
	public String giveAdvice() {
		return "Flamme d'Udun !";
	}

	public Gandalf(OutfitInterface theDress) {
		dress = theDress;
	}

	@Override
	public String changeDress(String colorDress) {
		return this.dress.color("red");
	}

}
