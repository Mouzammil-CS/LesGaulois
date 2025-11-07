package personnages;

public class Gaulois {
	private String nom;
//	private int force;
	private int effetPotion=1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private Village village;
	public Gaulois(String nom, int force, int effetPotion, int nbTrophees) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.nbTrophees = nbTrophees;
		
		
	}
	public void setVillage(Village village) {
        this.village = village;
	}
	
	public Village getVillage() {
        return village;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		
	}

//	private String prendreParole() {
//		return "Le Gaulois" + ' ' + nom + " : ";
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}


	

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + ' ' + "envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup(force,effetPotion);
//		effetPotion -= 1;
//		
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
		romain.getNom());
		Equipement trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
		}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	public void sePresenter() {
	    String message = "Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". ";

	    if (village == null) {
	        message += "Je voyage de villages en villages.\"";
	    } else if (this == village.getChef()) {
	        message += "Je suis le chef du village " + village.getNom() + ".\"";
	    } else {
	        message += "J'habite le village " + village.getNom() + ".\"";
	    }

	    System.out.println(message);
	}

	
	@Override
	public String toString() {
		return "Gaulois [nom= " + nom + ", force=" + force + ", effetPotions=" + effetPotion + "]";
	}
	
	
		
	

	

	
}
	
	
	
	
	
	
		

