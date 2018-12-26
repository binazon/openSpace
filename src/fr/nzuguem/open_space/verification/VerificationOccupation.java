package fr.nzuguem.open_space.verification;

import java.util.Date;
import java.util.List;

import fr.nzuguem.open_space.OpenSpace;
import fr.nzuguem.open_space.employe.Employe;
import fr.nzuguem.open_space.employe.Occupation;

public class VerificationOccupation {

	protected OpenSpace openSpace;
	private static List<Occupation> occupations;
	
	public VerificationOccupation(OpenSpace openSpace) {
		this.openSpace=openSpace;
		this.occupations=this.openSpace.getOccupations();
	}
	
	public Employe verification(Date dateDebut, Date dateFin, String numeroEmplacement) {
		
		for(Occupation occupation:occupations) {
			if(occupation.getDateDebut().equals(dateDebut) && occupation.getDateFin().equals(dateFin) && occupation.getPosteTravail().getNumeroEmplacement().equals(numeroEmplacement))
				return occupation.getEmploye();
		}
		
		return null;
	}
}
