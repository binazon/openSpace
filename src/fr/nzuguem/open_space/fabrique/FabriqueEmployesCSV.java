package fr.nzuguem.open_space.fabrique;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.nzuguem.open_space.employe.Employe;
import fr.nzuguem.open_space.employe.Statut;

public class FabriqueEmployesCSV implements IFabriqueEmployesCSV {

	@Override
	public List<Employe> employesDeFichierCSV(String pathCSVFile) {
		List<Employe> employes = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(pathCSVFile))) {

			String delemiteur = ",";
			// create an instance of BufferedReader
			// using try with resource, Java 7 feature to close resources

			// read the first line from the text file
			String line = br.readLine();

			// loop until all lines are read
			while (line != null) {

				// use string.split to load a string array with the values from
				// each line of
				// the file, using a comma as the delimiter
				String[] attributes = line.split(delemiteur);

				Employe employe = FabriqueEmployesCSV.creerEmploye(attributes);

				// adding book into ArrayList
				employes.add(employe);

				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return employes;
	}

	private static Employe creerEmploye(String[] metadata) {
		String nom = (String) metadata[0];
		String prenom = (String) metadata[1];
		Statut statut;
		if (metadata[2].equalsIgnoreCase("DEVELOPPEUR"))
			statut = Statut.DEVELOPPEUR;
		else if (metadata[2].equalsIgnoreCase("CHEF_PROJET"))
			statut = Statut.CHEF_PROJET;
		else if (metadata[2].equalsIgnoreCase("STAGIAIRE"))
			statut = Statut.STAGIAIRE;
		else
			statut = Statut.INVITE;
		// create and return book of this metadata
		return new Employe(nom, prenom, statut);
	}

}