/**
 * nom de la classe:Attestation
 *description: c'est une classe qui presente les attestations
 *date: 23/05/2013 
 */
package com.gsa.metier.bo;

import java.util.Date;

/**
 * c'est une classe qui reprisente les attestations
 * @author ELBARKANI
 *
 */
public class Attestation {
	/**
	 * il represente l'identifiant de l'attestation
	 */
	private Long idAttestation;
	/**
	 * il represente la date de la demande de l'attestation
	 */
	private Date dateDemande;
	/**
	 * il represente l'etat de l'attestation,initial,valider,prete....
	 */
	private char etatAttestation;

	/**
	 * constructeur sans argument
	 */
	public Attestation() {
	}

	/**
	 * @param dateDemande
	 * @param etatAttestation
	 */
	public Attestation(Date dateDemande, char etatAttestation) {
		this.dateDemande = dateDemande;
		this.etatAttestation = etatAttestation;
	}

	/**
	 * @return the idAttestation
	 */
	public Long getIdAttestation() {
		return idAttestation;
	}

	/**
	 * @param idAttestation the idAttestation to set
	 */
	public void setIdAttestation(Long idAttestation) {
		this.idAttestation = idAttestation;
	}

	/**
	 * @return the dateDemande
	 */
	public Date getDateDemande() {
		return dateDemande;
	}

	/**
	 * @param dateDemande the dateDemande to set
	 */
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	/**
	 * @return the etatAttestation
	 */
	public char getEtatAttestation() {
		return etatAttestation;
	}

	/**
	 * @param etatAttestation the etatAttestation to set
	 */
	public void setEtatAttestation(char etatAttestation) {
		this.etatAttestation = etatAttestation;
	}

	/**
	 * la method toString pour le debug
	 */
	public String toString() {
		return "Attestation [idAttestation=" + idAttestation + ", dateDemande="
				+ dateDemande + ", etatAttestation=" + etatAttestation + "]";
	}
	
	
	
	
	
	
}
