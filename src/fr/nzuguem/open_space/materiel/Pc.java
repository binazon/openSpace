package fr.nzuguem.open_space.materiel;

public class Pc extends Materiel{

	protected String marque;
	protected String vitesse;
	protected String ram;
	protected String dd;
	protected String ssd;
	protected String os;
	protected String mac;
	protected String ip;
	
	public Pc(String marque, String vitesse, String ram, String dd, String ssd, String os) {
		
		this.type=getClass().getSimpleName();
		this.marque = marque;
		this.vitesse = vitesse;
		this.ram = ram;
		this.dd = dd;
		this.ssd = ssd;
		this.os = os;
	}
	
	
	
}
