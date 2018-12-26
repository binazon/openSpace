package fr.nzuguem.open_space.materiel;

public class Telephone extends Materiel{
	
	protected int numeroInterne;
	
	public Telephone(int numeroInterne) {
		
		this.type=getClass().getSimpleName();
		this.numeroInterne=numeroInterne;
	}
}
