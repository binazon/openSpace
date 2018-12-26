package fr.nzuguem.open_space.employe;

import java.util.Date;

public class Occupation {
	protected Employe employe;
	protected PosteTravail posteTravail;
	protected Date dateDebut;
	protected Date dateFin;
	
	
	
	
	public Occupation(Employe employe, PosteTravail posteTravail, Date dateDebut, Date dateFin) {
		this.employe = employe;
		this.posteTravail = posteTravail;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	/**
	 * @return the employe
	 */
	public Employe getEmploye() {
		return employe;
	}
	/**
	 * @param employe the employe to set
	 */
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	/**
	 * @return the posteTravail
	 */
	public PosteTravail getPosteTravail() {
		return posteTravail;
	}
	/**
	 * @param posteTravail the posteTravail to set
	 */
	public void setPosteTravail(PosteTravail posteTravail) {
		this.posteTravail = posteTravail;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
}
