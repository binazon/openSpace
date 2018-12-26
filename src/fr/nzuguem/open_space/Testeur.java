package fr.nzuguem.open_space;

import java.util.Date;

import fr.nzuguem.open_space.employe.Employe;
import fr.nzuguem.open_space.employe.Occupation;
import fr.nzuguem.open_space.employe.Statut;
import fr.nzuguem.open_space.facade.IOpenSpaceFacade;
import fr.nzuguem.open_space.facade.OpenSpaceFacade;

public class Testeur {

	public static void main(String[] args) {
			OpenSpace openSpace =new OpenSpace("KEV-SPACE");
			IOpenSpaceFacade openSpaceFacade=new OpenSpaceFacade();
			openSpaceFacade.ajouterMateriels(openSpace, 15.0,100);
			openSpaceFacade.ajouterPosteTravail(openSpace, "DRH");
			openSpaceFacade.ajouterListeEmployesDeFichier(openSpace, "/home/nzuguem/Documents/employes.csv");
			openSpaceFacade.ajouterMaterielAPosteTravail(openSpace.getPosteTravails().get(0), openSpace.materiels.get(0));
			Date date=new Date();
			openSpaceFacade.ajouterOccupation(openSpace, openSpace.getPosteTravails().get(0), openSpace.getEmployes().get(0), date, date);
			openSpaceFacade.ajouterOccupation(openSpace, openSpace.getPosteTravails().get(0), openSpace.getEmployes().get(0), date, date);
			for(Occupation occupation:openSpace.occupations) {
				System.out.println(occupation.getEmploye().getNom()+" "+occupation.getEmploye().getStatut()+" "+occupation.getPosteTravail().getNumeroEmplacement());
			}
			
			openSpaceFacade.visiterEmployes(openSpace);
			
	}

}
