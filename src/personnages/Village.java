package personnages;

public class Village {
	private String nom;
	private int NB_VILLAGEOIS_MAX;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois[] chef = new Gaulois[1];
	
	public Village(String nom,Gaulois chef,int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.NB_VILLAGEOIS_MAX = NB_VILLAGEOIS_MAX;
		villageois = new Gaulois [NB_VILLAGEOIS_MAX];
		ajouterVillageois(chef);
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return villageois[0];
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois<NB_VILLAGEOIS_MAX) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
		else {
			System.out.println("Il n'est pas possible d'ajouter un autre villageois car on a atteint le nombre de villageois maximum possible");
		}
	}
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois>=0 && numVillageois < nbVillageois ) {
				return villageois[numVillageois];
				}
				else {
					System.out.println("Il n'y a pas autant d'habitants dans notre village");
					return null;
				}
	
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix",6);
		Village village = new Village("Village des Irréductibles",abraracourcix,30);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
	}
	
}
