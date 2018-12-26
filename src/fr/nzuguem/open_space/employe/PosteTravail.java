package fr.nzuguem.open_space.employe;

import java.util.ArrayList;
import java.util.List;

import fr.nzuguem.open_space.materiel.Materiel;

public class PosteTravail {
	
	protected String numeroEmplacement;
	protected List<Materiel> materiels= new ArrayList<>();
	
	
	public PosteTravail(String numeroEmplacement) {
		this.numeroEmplacement = numeroEmplacement;
	}
	/**
	 * @return the numeroEmplacement
	 */
	public String getNumeroEmplacement() {
		return numeroEmplacement;
	}
	/**
	 * @param numeroEmplacement the numeroEmplacement to set
	 */
	public void setNumeroEmplacement(String numeroEmplacement) {
		this.numeroEmplacement = numeroEmplacement;
	}
	/**
	 * @return the materiels
	 */
	public List<Materiel> getMateriels() {
		return materiels;
	}
	/**
	 * @param materiels the materiels to set
	 */
	public void setMateriels(List<Materiel> materiels) {
		this.materiels = materiels;
	}
	
	
	
}
