/**
 * nom de la classe:Etudiant
 *description: c'est une classe qui presente les etudiants
 *date: 23/05/2013 
 */
package com.gsa.metier.bo;

import java.util.HashSet;
import java.util.Set;

/**
 * c'est une classe qui represente les etudiants et qui herite de la classe utilisateur
 * @author ELBARKANI
 *
 */
public class Etudiant extends Utilisateur {
	/**
	 * il represnete le cne de l'etudiant
	 */
	private String cne;
	/**
	 * il represnete le numero de l'inscription de l'etudiant
	 */
	private int numeroInscription;
	/**
	 * il represente le niveau scolaire de l'etudiant
	 */
	private Niveau niveau;
	/**
	 * il represente la liste des absences de l'etudiant
	 */
	private Set<Absence> absences = new HashSet<Absence>();
	/**
	 * il represente la liste des attestation de l'etudiant
	 */
	private Set<Attestation> attestations = new HashSet<Attestation>();
	/**
	 * constructeur sans argument
	 */
	public Etudiant() {
	}
	/**
	 * @param cne
	 * @param numeroInscription
	 * @param niveau
	 * @param absences
	 * @param attestations
	 */
	public Etudiant(String cne, int numeroInscription, Niveau niveau,
			Set<Absence> absences, Set<Attestation> attestations) {
		this.cne = cne;
		this.numeroInscription = numeroInscription;
		this.niveau = niveau;
		this.absences = absences;
		this.attestations = attestations;
	}
	/**
	 * @return the cne
	 */
	public String getCne() {
		return cne;
	}
	/**
	 * @param cne the cne to set
	 */
	public void setCne(String cne) {
		this.cne = cne;
	}
	/**
	 * @return the numeroInscription
	 */
	public int getNumeroInscription() {
		return numeroInscription;
	}
	/**
	 * @param numeroInscription the numeroInscription to set
	 */
	public void setNumeroInscription(int numeroInscription) {
		this.numeroInscription = numeroInscription;
	}
	/**
	 * @return the niveau
	 */
	public Niveau getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	/**
	 * @return the absences
	 */
	public Set<Absence> getAbsences() {
		return absences;
	}
	/**
	 * @param absences the absences to set
	 */
	public void setAbsences(Set<Absence> absences) {
		this.absences = absences;
	}
	/**
	 * @return the attestations
	 */
	public Set<Attestation> getAttestations() {
		return attestations;
	}
	/**
	 * @param attestations the attestations to set
	 */
	public void setAttestations(Set<Attestation> attestations) {
		this.attestations = attestations;
	}
	/**
	 * la method toString pour le debug
	 */
	public String toString() {
		return "Etudiant [cne=" + cne + ", numeroInscription="
				+ numeroInscription + ", attestations=" + attestations + "]";
	}
	
	
	
}
