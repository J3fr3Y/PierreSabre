package personnages;

public class Humain {
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	protected String nom;
	private String boisson;
	protected int argent;

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println("-Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + this.boisson);
	}

	public void boire() {
		System.out.println("-Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + this.argent + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir " + bien
					+ " à 50 sous");
		}
	}

	public void gagnerArgent(int gain) {
		this.argent += gain;

	}

	public void perdreArgent(int perte) {
		this.argent -= perte;
	}

	public void parler(String texte) {
		System.out.println("-" + texte + "");
	}
}
