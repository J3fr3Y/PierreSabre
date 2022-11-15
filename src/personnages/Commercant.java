package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	public void seFaireExtorquer() {
		argent=0;
		parler("J''ai tout perdu! Le monde est trop injuste...");
		gagnerArgent(15);
		parler(this.argent + " sous! Je te remercie généreux donateur!");
	}
	
	
	
	
	
}
