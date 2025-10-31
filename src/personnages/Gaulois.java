package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village[] village;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.village = new Village[1];
		
		
	}
	public void setVillage(Village village) {
        this.village[0] = village;
	}
	
	public Village getVillage() {
        return village[0];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		
	}

	private String prendreParole() {
		return "Le Gaulois" + ' ' + nom + " : ";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + ' ' + "envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force,effetPotion);
		effetPotion -= 1;
		
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	public void sePresenter() {
	    String message = "Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". ";

	    if (village[0] == null) {
	        message += "Je voyage de villages en villages.\"";
	    } else if (this == village[0].getChef()) {
	        message += "Je suis le chef du village " + village[0].getNom() + ".\"";
	    } else {
	        message += "J'habite le village " + village[0].getNom() + ".\"";
	    }

	    System.out.println(message);
	}


	@Override
	public String toString() {
		return getNom();
	}
	
	
		
	

	

	
}
	
	
	
	
	
	
		

