/**
 * nom de la classe:Utilisateur
 *description: c'est une classe qui presente les utilisateurs
 *date: 23/05/2013 
 */
package com.gsa.metier.bo;

import java.util.Date;

/**
 * c'est une classe qui represente les utilisateurs 
 * @author ELBARKANI
 *
 */
public class Utilisateur {
	/**
	 * il represente l'identifiant de l'utilisateur
	 */
	private Long idUtilisateur;
	/**
	 * il represente le nom de l'utilisateur 
	 */
	private String nom;
	/**
	 * il represente le prenom de l'utilisateur 
	 */
	private String prenom;
	/**
	 * il presente la date de naissance de l'utilisateur
	 */
	private Date dateNaissance;
	/**
	 * il represente le lieu de naissance de l'utilisateur
	 */
	private String lieuNaissance;
	/**
	 * il represente le sexe de l'utilisateur 
	 */
	private char sexe;
	/**
	 * il represente le cin de l'utilisateur
	 */
	private String cin;
	/**
	 * il represente le numero de telephone l'utilisateur
	 */
	private String tel;
	/**
	 * il represente le login de l'utilisateur
	 */
	private String login;
	/**
	 * il represente le mot de passe de l'utilisateur
	 */
	private String password;
	/**
	 * il represente l'etat du compte de l'utilisateur 
	 * exemple: erronné	 */
	private int etatCompte;
	/**
	 * il represente l'adresse de l'utilisateur
	 */
	private String adresse;
	/**
	 * il represente l'email de l'utilisateur
	 */
	private String email;
	/**
	 * represente le role de l'utilisateur
	 */
	private Role role;
	
	/**
	 * constructeur sans argument
	 */
	public Utilisateur() {
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param lieuNaissance
	 * @param sexe
	 * @param cin
	 * @param tel
	 * @param login
	 * @param password
	 * @param etatCompte
	 * @param adresse
	 * @param email
	 * @param role
	 */
	public Utilisateur(String nom, String prenom, Date dateNaissance,
			String lieuNaissance, char sexe, String cin, String tel,
			String login, String password, int etatCompte, String adresse,
			String email, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.sexe = sexe;
		this.cin = cin;
		this.tel = tel;
		this.login = login;
		this.password = password;
		this.etatCompte = etatCompte;
		this.adresse = adresse;
		this.email = email;
		this.role = role;
	}

	/**
	 * @return the idUtilisateur
	 */
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * @param idUtilisateur the idUtilisateur to set
	 */
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the lieuNaissance
	 */
	public String getLieuNaissance() {
		return lieuNaissance;
	}

	/**
	 * @param lieuNaissance the lieuNaissance to set
	 */
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	/**
	 * @return the sexe
	 */
	public char getSexe() {
		return sexe;
	}

	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}

	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the etatCompte
	 */
	public int getEtatCompte() {
		return etatCompte;
	}

	/**
	 * @param etatCompte the etatCompte to set
	 */
	public void setEtatCompte(int etatCompte) {
		this.etatCompte = etatCompte;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * la method toString pour le debug
	 */
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom
				+ ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", lieuNaissance=" + lieuNaissance + ", sexe=" + sexe
				+ ", cin=" + cin + ", tel=" + tel + ", login=" + login
				+ ", password=" + password + ", etatCompte=" + etatCompte
				+ ", adresse=" + adresse + ", email=" + email + ", role="
				+ role + "]";
	}
	
	
	
	
	


	
	
	
}
