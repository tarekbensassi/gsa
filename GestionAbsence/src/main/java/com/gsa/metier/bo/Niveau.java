/**
 * nom de la classe:Niveau
 *description: c'est une classe qui presente le niveau d'un etudiant
 *date: 23/05/2013 
 */
package com.gsa.metier.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * la classe Niveau presente le niveau d'un etudiant
 * @author ELBARKANI
 *
 */
public class Niveau {
	/**
	 * il reprente l'identifiant du niveau  
	 */
	private Long idNiveau;
	/**
	 * il represente le libelle du niveau
	 */
	private String libelleNiveau;
	/**
	 * il represente la liste des matieres du niveau
	 */
	private List<Matiere> matieres = new ArrayList<Matiere>();
	/**
	 * constructeur par defaut
	 */
	public Niveau() {
	}
	/**
	 * @param libelleNiveau
	 * @param matieres
	 */
	public Niveau(String libelleNiveau, List<Matiere> matieres) {
		this.libelleNiveau = libelleNiveau;
		this.matieres = matieres;
	}
	/**
	 * @return the idNiveau
	 */
	public Long getIdNiveau() {
		return idNiveau;
	}
	/**
	 * @param idNiveau the idNiveau to set
	 */
	public void setIdNiveau(Long idNiveau) {
		this.idNiveau = idNiveau;
	}
	/**
	 * @return the libelleNiveau
	 */
	public String getLibelleNiveau() {
		return libelleNiveau;
	}
	/**
	 * @param libelleNiveau the libelleNiveau to set
	 */
	public void setLibelleNiveau(String libelleNiveau) {
		this.libelleNiveau = libelleNiveau;
	}
	/**
	 * @return the matieres
	 */
	public List<Matiere> getMatieres() {
		return matieres;
	}
	/**
	 * @param matieres the matieres to set
	 */
	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Niveau [idNiveau=" + idNiveau + ", libelleNiveau="
				+ libelleNiveau + "]";
	}
	
	
}
