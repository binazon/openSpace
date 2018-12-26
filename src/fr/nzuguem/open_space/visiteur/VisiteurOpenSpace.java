package fr.nzuguem.open_space.visiteur;

import fr.nzuguem.open_space.OpenSpace;
import fr.nzuguem.open_space.employe.Employe;

public class VisiteurOpenSpace implements IVisiteur {

	@Override
	public void visiterVisitable(IVisitable visitable) {
		
		if(visitable == null) return;
		if(!(visitable instanceof OpenSpace)) return ;
		
		OpenSpace openSpace=(OpenSpace) visitable;
		StringBuilder builder=new StringBuilder("");
		for(Employe employe:openSpace.getEmployes()) {
			builder.append("Nom : "+employe.getNom()+"\n" );
			builder.append("Prenom : "+employe.getPrenom()+"\n" );
			builder.append("Statut : "+employe.getStatut()+"\n" );
			builder.append("**************************************************************\n");
		}
		System.out.println(builder.toString());		
		
	}

}
