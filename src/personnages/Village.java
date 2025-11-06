package personnages;



public class Village {
    private String nom;
    private int NB_VILLAGEOIS_MAX;
    private int nbVillageois = 0;
    private Gaulois[] villageois;
    private Gaulois chef;

    public Village(String nom, Gaulois chef, int NB_VILLAGEOIS_MAX) {
        this.nom = nom;
        this.chef = chef;
        this.NB_VILLAGEOIS_MAX = NB_VILLAGEOIS_MAX;
        villageois = new Gaulois[NB_VILLAGEOIS_MAX];
        
        chef.setVillage(this);
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < NB_VILLAGEOIS_MAX) {
            villageois[nbVillageois] = gaulois;
            gaulois.setVillage(this);
            nbVillageois++;
        } else {
            System.out.println("Village plein !");
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        if (numVillageois >= 0 && numVillageois < nbVillageois) {
            return villageois[numVillageois];
        } else {
            System.out.println("Aucun villageois à cet index !");
            return null;
        }
    }

    public void afficherVillageois() {
        System.out.println("Dans le village " + nom + 
            " du chef " + chef.getNom() + " vivent :");
        
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }

    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", abraracourcix, 30);

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        Gaulois gaulois = village.trouverVillageois(0);
        System.out.println(gaulois);

        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);

        village.afficherVillageois();
        
        Gaulois obelix = new Gaulois("Obélix",25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();
        
        Gaulois doublepolemix = new Gaulois("DoublePolémix",4);
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublepolemix.sePresenter();
    }
}