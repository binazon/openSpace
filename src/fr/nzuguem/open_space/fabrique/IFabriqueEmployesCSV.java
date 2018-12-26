package fr.nzuguem.open_space.fabrique;

import java.util.List;

import fr.nzuguem.open_space.employe.Employe;

public interface IFabriqueEmployesCSV {
	
	public  List<Employe> employesDeFichierCSV(String pathCSVFile);
}
