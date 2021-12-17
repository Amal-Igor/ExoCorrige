package fr.dawan.general.objectTest;

public class CompteBancaire {
	
	private String nomPropritaire;
	private String numeroCompte;
	private double solde;
	
	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String nomPropritaire, String numeroCompte, double solde) {
		super();
		this.nomPropritaire = nomPropritaire;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public String getNomPropritaire() {
		return nomPropritaire;
	}

	public void setNomPropritaire(String nomPropritaire) {
		this.nomPropritaire = nomPropritaire;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte Bancaire de " + this.nomPropritaire + "." + "\nSolde Actuel : " + this.solde + "€";
	}

	/*
	 * 
	 * Nous nous servons du fait que chaque variable de la classe possède un identifiant obtenu avec la méthode hascode
	 * En combinant chaque identifiant de chaque attribut nous pouvont en créer un nouveau
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomPropritaire == null) ? 0 : nomPropritaire.hashCode());
		result = prime * result + ((numeroCompte == null) ? 0 : numeroCompte.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	CompteBancaire cb = (CompteBancaire) obj;
		
		//On verifie si l'objet en paramètre est null
		if(cb == null) {
			return false;
		}
		
		//Comparer les attributs de l'instance courante et de l'objet passé en paramètre
		return this.nomPropritaire == cb.nomPropritaire && this.numeroCompte == cb.numeroCompte && this.solde == cb.solde;
	}
	
	
	
	
}
