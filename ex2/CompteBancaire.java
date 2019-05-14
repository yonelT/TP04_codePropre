package ex2;

/** Represente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un decouvert est autorise seulement pour les comptes courants */
	private double decouvert;
		
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;
	
	/** Constructeur CompteBancaire
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ce constructeur est utilise pour creer un compte de type Livret A
	 * @param type = LA
	 * @param solde represente le solde du compte
	 * @param decouvert  repreente le decouvert autorise
	 * @param tauxRemuneration  represente le taux de remuneration du livret A
	 */
	public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant a ajouter
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Retire un montant au solde
	 * @param montant a retirer
	 */
	public void debiterMontant(double montant){
		if (pasADecouvert(montant)) {
			this.solde = solde - montant;
		}
	}
	
	/** Methode pour s'assurer que le compte n'est pas a decouvert
	 * @param montant a retirer
	 */
	public boolean pasADecouvert(double montant) {

		if (this.solde - montant < decouvert) {
			return true;
		} else {
			return false;
		}

	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
