/**
 * nom de la classe:Absence
 *description: c'est une classe qui presente les absences d'un etudiant
 *date: 23/05/2013 
 */
package com.gsa.metier.bo;

import java.util.Date;

/**
 * la classe Absence represente les absence d'un etudiant
 * @author ELBARKANI
 *
 */
public class Absence {
	/**
	 * il represente l'identifiant de l'absence
	 */
	private Long idAbsence;
	/**
	 * il represente la date de l'absence
	 */
	private Date dateAbsence;
	/**
	 * il reprisante la matiere absenté
	 */
	private Matiere matiere;
	/**
	 * constructeur sans arguments
	 */
	public Absence() {
	}
	/**
	 * @param dateAbsence
	 * @param matiere
	 */
	public Absence(Date dateAbsence, Matiere matiere) {
		this.dateAbsence = dateAbsence;
		this.matiere = matiere;
	}
	/**
	 * @return the idAbsence
	 */
	public Long getIdAbsence() {
		return idAbsence;
	}
	/**
	 * @param idAbsence the idAbsence to set
	 */
	public void setIdAbsence(Long idAbsence) {
		this.idAbsence = idAbsence;
	}
	/**
	 * @return the dateAbsence
	 */
	public Date getDateAbsence() {
		return dateAbsence;
	}
	/**
	 * @param dateAbsence the dateAbsence to set
	 */
	public void setDateAbsence(Date dateAbsence) {
		this.dateAbsence = dateAbsence;
	}
	/**
	 * @return the matiere
	 */
	public Matiere getMatiere() {
		return matiere;
	}
	/**
	 * @param matiere the matiere to set
	 */
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	/**
	 * la method toString pour le debug
	 */
	public String toString() {
		return "Absence [idAbsence=" + idAbsence + ", dateAbsence="
				+ dateAbsence + ", matiere=" + matiere + "]";
	}
	
}

