package fr.nzuguem.open_space.facade;

import java.util.Date;
import java.util.List;

import fr.nzuguem.open_space.OpenSpace;
import fr.nzuguem.open_space.employe.Employe;
import fr.nzuguem.open_space.employe.Occupation;
import fr.nzuguem.open_space.employe.PosteTravail;
import fr.nzuguem.open_space.materiel.Materiel;

public interface IOpenSpaceFacade {
	
	public void ajouterListeEmployesDeFichier(OpenSpace openSpace,String pathFile);
	public void ajouterPosteTravail(OpenSpace openSpace,String numeroEmplacement);
	public void ajouterMateriel(OpenSpace openSpace,String marque, String vitesse, String ram, String dd, String ssd, String os);
	public void ajouterMateriel(OpenSpace openSpace,double pouces);
	public void ajouterMateriel(OpenSpace openSpace,int numeroInterne);
	public void ajouterMateriels(OpenSpace openSpace,String marque, String vitesse, String ram, String dd, String ssd, String os, int nbre);
	public void ajouterMateriels(OpenSpace openSpace,double pouces, int nbre);
	public void ajouterMateriels(OpenSpace openSpace,int numeroInterne, int nbre);
	public void ajouterOccupation(OpenSpace openSpace,PosteTravail posteTravail, Employe employe,Date dateDebut, Date dateFin);
	public void ajouterMaterielAPosteTravail(PosteTravail posteTravail, Materiel materiel);
	public void ajouterMaterielsAPosteTravail(PosteTravail posteTravail, List<Materiel> materiels);
	public List<Occupation> getListeOccupations(OpenSpace openSpace);
	public void visiterEmployes(OpenSpace openSpace);
	
}
