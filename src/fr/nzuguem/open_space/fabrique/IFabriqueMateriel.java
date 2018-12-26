package fr.nzuguem.open_space.fabrique;

import java.util.List;

import fr.nzuguem.open_space.materiel.Materiel;

public interface IFabriqueMateriel {
	
	public Materiel creerMateriel(String marque, String vitesse, String ram, String dd, String ssd, String os);
	public Materiel creerMateriel(double pouces);
	public Materiel creerMateriel(int numeroInterne);
	public List<Materiel> creerMateriels(String marque, String vitesse, String ram, String dd, String ssd, String os, int nbre);
	public List<Materiel> creerMateriels(double pouces, int nbre);
	public List<Materiel> creerMateriels(int numeroInterne, int nbre);
	
}
