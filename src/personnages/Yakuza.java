package personnages;

//import personnages.Commercant;
//import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	int reputation=4;

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
		this.reputation+=1;
	}
	
	public int perdre() {
		parler("J'ai perdu mon duel et mes " + this.argent + " snif... J'ai déshonoré le clan de " + this.clan);
		argent=0;
		return reputation-=1;
	}
	
	public void gagner(int gain) {
		argent+=gain;
		reputation +=1;
		parler("Ce ronin pensait vraiment battre " +this.nom + " du clan de " +this.clan +"?\n "
				+ "Je l'ai dépouillé de ses " + gain + " sous.");
		
	}

}
