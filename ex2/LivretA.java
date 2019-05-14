package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration: taux de remuneration d'un livret A */
	private double tauxRemuneration;
	
	/**
	 * Constructeur pour un LivretA
	 * 
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA (String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * Methode appliquant la remuneration annuelle sur les LivretA
	 * 
	 * @param livretA
	 */
	public void appliquerRemuAnnuelle(LivretA livretA){
		double remunerationAnnuelle = livretA.getSolde() + livretA.getSolde() * livretA.getTauxRemuneration() / 100;
		livretA.setSolde(remunerationAnnuelle);
	}
	
	/**
	 * Getter
	 * 
	 * @return le taux de remuneration d'un livret A
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	/**
	 * Setter
	 * 
	 * @param tauxRemuneration: Definit le taux de remuneration d'un livret A
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
