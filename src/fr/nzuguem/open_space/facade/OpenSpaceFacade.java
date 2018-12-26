package fr.nzuguem.open_space.facade;

import java.util.Date;
import java.util.List;

import fr.nzuguem.open_space.OpenSpace;
import fr.nzuguem.open_space.employe.Employe;
import fr.nzuguem.open_space.employe.Occupation;
import fr.nzuguem.open_space.employe.PosteTravail;
import fr.nzuguem.open_space.fabrique.FabriqueEmployesCSV;
import fr.nzuguem.open_space.fabrique.FabriqueMateriel;
import fr.nzuguem.open_space.fabrique.IFabriqueEmployesCSV;
import fr.nzuguem.open_space.fabrique.IFabriqueMateriel;
import fr.nzuguem.open_space.materiel.Materiel;
import fr.nzuguem.open_space.verification.VerificationOccupation;
import fr.nzuguem.open_space.visiteur.IVisiteur;
import fr.nzuguem.open_space.visiteur.VisiteurOpenSpace;

public class OpenSpaceFacade implements IOpenSpaceFacade{

	@Override
	public void ajouterListeEmployesDeFichier(OpenSpace openSpace, String pathFile) {
		IFabriqueEmployesCSV fabriqueEmployesCSV=new FabriqueEmployesCSV();
		openSpace.getEmployes().addAll(fabriqueEmployesCSV.employesDeFichierCSV(pathFile));
	}

	@Override
	public void ajouterPosteTravail(OpenSpace openSpace, String numeroEmplacement) {
		openSpace.getPosteTravails().add(new PosteTravail(numeroEmplacement));
		
	}

	@Override
	public void ajouterMateriel(OpenSpace openSpace, String marque, String vitesse, String ram, String dd, String ssd,String os) {
		IFabriqueMateriel fabriqueMateriel=new FabriqueMateriel();
		openSpace.getMateriels().add(fabriqueMateriel.creerMateriel(marque, vitesse, ram, dd, ssd, os));
		
	}

	@Override
	public void ajouterMateriel(OpenSpace openSpace, double pouces) {
		IFabriqueMateriel fabriqueMateriel=new FabriqueMateriel();
		openSpace.getMateriels().add(fabriqueMateriel.creerMateriel(pouces));
	}

	@Override
	public void ajouterMateriel(OpenSpace openSpace, int numeroInterne) {
		IFabriqueMateriel fabriqueMateriel=new FabriqueMateriel();
		openSpace.getMateriels().add(fabriqueMateriel.creerMateriel(numeroInterne));
	}

	@Override
	public void ajouterMateriels(OpenSpace openSpace, String marque, String vitesse, String ram, String dd, String ssd,String os, int nbre) {
		IFabriqueMateriel fabriqueMateriel=new FabriqueMateriel();
		openSpace.getMateriels().addAll(fabriqueMateriel.creerMateriels(marque, vitesse, ram, dd, ssd, os,nbre));
	}

	@Override
	public void ajouterMateriels(OpenSpace openSpace, double pouces, int nbre) {
		IFabriqueMateriel fabriqueMateriel=new FabriqueMateriel();
		openSpace.getMateriels().addAll(fabriqueMateriel.creerMateriels(pouces,nbre));
	}

	@Override
	public void ajouterMateriels(OpenSpace openSpace, int numeroInterne, int nbre) {
		IFabriqueMateriel fabriqueMateriel=new FabriqueMateriel();
		openSpace.getMateriels().addAll(fabriqueMateriel.creerMateriels(numeroInterne,nbre));
	}

	@Override
	public void ajouterOccupation(OpenSpace openSpace, PosteTravail posteTravail, Employe employe, Date dateDebut, Date dateFin) {
		VerificationOccupation verificationOccupation=new VerificationOccupation(openSpace);
		if(verificationOccupation.verification(dateDebut, dateFin, posteTravail.getNumeroEmplacement())==null)
		   openSpace.getOccupations().add(new Occupation(employe, posteTravail, dateDebut, dateFin));
	}

	@Override
	public void ajouterMaterielAPosteTravail(PosteTravail posteTravail, Materiel materiel) {
		posteTravail.getMateriels().add(materiel);
		
	}

	@Override
	public void ajouterMaterielsAPosteTravail(PosteTravail posteTravail, List<Materiel> materiels) {
		posteTravail.getMateriels().addAll(materiels);
		
	}

	@Override
	public List<Occupation> getListeOccupations(OpenSpace openSpace) {
		return openSpace.getOccupations();
	}

	@Override
	public void visiterEmployes(OpenSpace openSpace) {
		IVisiteur visiteur=new VisiteurOpenSpace();
		openSpace.accepterVisiteur(visiteur);
		
	}

	

}
