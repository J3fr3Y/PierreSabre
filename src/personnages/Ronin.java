package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	private int don;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		don=(this.argent*10)/100;
		parler(beneficiaire.nom + " prend ces " + this.don +" sous.");
		parler(this.don + " sous! Je te remercie généreux donateur!");
		this.honneur +=1;
	}

}
