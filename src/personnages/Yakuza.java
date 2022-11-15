package personnages;

import personnages.Commercant;
import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne seait-ce pas un faible marchand qui passe par là?");
		parler(victime.nom +", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		gagnerArgent(victime.argent);
		parler("J'ai piqué les "+ victime.argent + " sous de " + victime.nom + ", ce qui me fait " + this.argent + " sous dans ma poche. Hi ! Hi !");
	}

}
