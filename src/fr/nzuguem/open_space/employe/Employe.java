package fr.nzuguem.open_space.employe;

public class Employe {

	
	protected String nom;
	protected String prenom;
	protected Statut statut;
	
	
	
	public Employe(String nom, String prenom, Statut statut) {
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the statut
	 */
	public Statut getStatut() {
		return statut;
	}
	/**
	 * @param statut the statut to set
	 */
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	
	
}
