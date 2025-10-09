package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"" );
		
	}
	private String prendreParole() {
		return "Le Druide" + ' ' + nom + ":";
	}
	
	public void fabriquerPotion(int quantite,int forcePotion) {
		remplirChaudron()
		parler("J'ai concocté" + ' ' + quantite + ' ' + "doses de potion magique. Elle a une force de" + ' ' + forcePotion);	
	}
	
	public void booster(Gaulois gaulois) {
		
	}
	
	
	

}
