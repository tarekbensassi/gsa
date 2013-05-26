/**
 * nom de la classe:Matiere
 *description: c'est une classe qui presente la matiere
 *date: 23/05/2013 
 */
package com.gsa.metier.bo;

/**
 * la classe Matiere presente la matiere
 * @author ELBARKANI
 *
 */
public class Matiere {
	/**
	 * il represente l'identifiant de la matiere
	 */
	private Long idMatiere;
	/**
	 * il represente le libelle de la matiere
	 */
	private String lebelleMatiere;
	/**
	 * constructeur sans argument
	 */
	public Matiere() {
	}
	/**
	 * @param lebelleMatiere
	 * @param niveau
	 */
	public Matiere(String lebelleMatiere) {
		this.lebelleMatiere = lebelleMatiere;
	}
	/**
	 * @return the idMatiere
	 */
	public Long getIdMatiere() {
		return idMatiere;
	}
	/**
	 * @param idMatiere the idMatiere to set
	 */
	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}
	/**
	 * @return the lebelleMatiere
	 */
	public String getLebelleMatiere() {
		return lebelleMatiere;
	}
	/**
	 * @param lebelleMatiere the lebelleMatiere to set
	 */
	public void setLebelleMatiere(String lebelleMatiere) {
		this.lebelleMatiere = lebelleMatiere;
	}
	/**
	 * la method toString pour le debug
	 */
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", lebelleMatiere="
				+ lebelleMatiere + "]";
	}
	
	

}
