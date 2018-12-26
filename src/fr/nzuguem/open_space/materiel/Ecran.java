package fr.nzuguem.open_space.materiel;

public class Ecran extends Materiel{
	
	protected double pouces;
	
	public Ecran(double pouces) {
		this.type=getClass().getSimpleName();
		this.pouces=pouces;
	}
}
