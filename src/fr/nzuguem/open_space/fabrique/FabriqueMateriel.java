package fr.nzuguem.open_space.fabrique;

import java.util.ArrayList;
import java.util.List;

import fr.nzuguem.open_space.materiel.Ecran;
import fr.nzuguem.open_space.materiel.Materiel;
import fr.nzuguem.open_space.materiel.Pc;
import fr.nzuguem.open_space.materiel.Telephone;

public class FabriqueMateriel implements IFabriqueMateriel {

	@Override
	public Materiel creerMateriel(String marque, String vitesse, String ram, String dd, String ssd, String os) {
		return new Pc(marque, vitesse, ram, dd, ssd, os);
	}

	@Override
	public Materiel creerMateriel(double pouces) {
		return new Ecran(pouces);
	}

	@Override
	public Materiel creerMateriel(int numeroInterne) {
		return new Telephone(numeroInterne);
	}

	@Override
	public List<Materiel> creerMateriels(String marque, String vitesse, String ram, String dd, String ssd, String os,
			int nbre) {
		List<Materiel> materiels=new ArrayList<>();
		for (int i = 0; i < nbre; i++) {
			materiels.add(this.creerMateriel(marque, vitesse, ram, dd, ssd, os));
		}
		
		return materiels;
	}

	@Override
	public List<Materiel> creerMateriels(double pouces, int nbre) {
		List<Materiel> materiels=new ArrayList<>();
		for (int i = 0; i < nbre; i++) {
			materiels.add(this.creerMateriel(pouces));
		}
		
		return materiels;
	}

	@Override
	public List<Materiel> creerMateriels(int numeroInterne, int nbre) {
		List<Materiel> materiels=new ArrayList<>();
		for (int i = 0; i < nbre; i++) {
			materiels.add(this.creerMateriel(numeroInterne));
		}
		
		return materiels;
	}

}
