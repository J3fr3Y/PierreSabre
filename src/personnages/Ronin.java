package personnages;

import personnages.Yakuza;

public class Ronin extends Humain{
	private int honneur = 1;
	private int don;
	private int force;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		don=(this.argent*10)/100;
		parler(beneficiaire.nom + " prend ces " + this.don +" sous.");
		parler(this.don + " sous! Je te remercie généreux donateur!");
		this.honneur +=1;
		argent-=don;
	}
	
	public void provoquer(Yakuza adversaire) {
		force=2*this.honneur;
		if(force >= adversaire.reputation) {
			gagnerArgent(adversaire.argent);
			this.honneur+=1;
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
		} else {
			adversaire.gagner(argent);
			perdreArgent(this.argent);
			this.honneur-=1;
			
		}
	}
}
