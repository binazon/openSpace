package fr.nzuguem.open_space;

import java.util.ArrayList;
import java.util.List;

import fr.nzuguem.open_space.employe.Employe;
import fr.nzuguem.open_space.employe.Occupation;
import fr.nzuguem.open_space.employe.PosteTravail;
import fr.nzuguem.open_space.materiel.Materiel;
import fr.nzuguem.open_space.visiteur.IVisitable;
import fr.nzuguem.open_space.visiteur.IVisiteur;

public class OpenSpace implements IVisitable{
	
	protected String identifiant;
	protected List<Employe> employes; 
	protected List<PosteTravail> posteTravails;
	protected List<Materiel> materiels;
	protected List<Occupation> occupations;
	
	
	
	public OpenSpace(String identifiant) {
		this.identifiant = identifiant;
		employes=new ArrayList<>();
		posteTravails=new ArrayList<>();
		materiels=new ArrayList<>();
		occupations=new ArrayList<>();
	}
	/**
	 * @return the employes
	 */
	public List<Employe> getEmployes() {
		return employes;
	}
	/**
	 * @return the posteTravails
	 */
	public List<PosteTravail> getPosteTravails() {
		return posteTravails;
	}
	/**
	 * @return the materiels
	 */
	public List<Materiel> getMateriels() {
		return materiels;
	}
	/**
	 * @return the occupations
	 */
	public List<Occupation> getOccupations() {
		return occupations;
	}
	@Override
	public void accepterVisiteur(IVisiteur visiteur) {
		visiteur.visiterVisitable(this);
		
	}
}
