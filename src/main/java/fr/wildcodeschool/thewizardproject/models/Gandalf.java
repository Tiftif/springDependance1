package fr.wildcodeschool.thewizardproject.models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {
	@Autowired
	private OutfitInterface dress;

	@Override
	public String giveAdvice() {
		return "Flamme d'Udun !";
	}
	
	public Gandalf(@Qualifier("outfit")OutfitInterface theDress) {
		dress = theDress;
	}

	@Override
	public String changeDress(String dress) {
		return this.dress.changeDress(dress);
	}

}
