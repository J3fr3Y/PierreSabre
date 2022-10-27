package personnages;

public class Humain {
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	private String nom;
	private String boisson;
	private int argent;
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		System.out.println("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + this.boisson);
	}
	
	public void boire() {
		System.out.println("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		bien= boisson;
		prix;
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent -=perte;
	}

	private String dialogue() {
		String texte = "L'humain " + nom + ":";
		return texte;
	}
	public void parler(String texte) {
		System.out.println(dialogue() + "« " + texte + "»");
		}
}