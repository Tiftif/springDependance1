package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;


@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {
	private OutfitInterface dress;

	@Override
	public String giveAdvice() {
		return "Do not pity the dead, Harry, pity the living. And above all, those who live without love.";
	}

	public Dumbledore(OutfitInterface theDress) {
		dress = theDress;
	}

	@Override
	public String changeDress(String dress) {
		return this.dress.changeDress(dress);
	}
}
