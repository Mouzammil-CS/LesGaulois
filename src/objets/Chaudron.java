package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Boolean resterPotion() {
		if (quantitePotion>0) {
			return true;
		}
		else {
			quantitePotion = 0;
			return false;
		}	
	}
	
	public void remplirChaudron(int quantite,int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
		
		
	}
	

}
