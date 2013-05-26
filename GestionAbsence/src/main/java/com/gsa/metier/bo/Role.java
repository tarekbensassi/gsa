/**
 * nom de la classe:Role
 * Description:c'est une classe qui represente un role 
 * date: 23/05/2013
 */
package com.gsa.metier.bo;

/**
 * c'est une classe qui represente le role d'un utilisateur exemple:admin,respensable...
 * 
 * @author ELBARKANI
 * 
 */
public class Role {

	/**
	 * il represente l'identifiant de la classe role
	 */
	private Long idRole;
	/**
	 * il represente le libelle du role
	 */
	private String libelleRole;

	/**
	 * costructeur sans argument
	 */
	public Role() {
	}

	/**
	 * @param libelleRole
	 *            : c'est le nom du role
	 */
	public Role(String libelleRole) {
		this.libelleRole = libelleRole;
	}

	/**
	 * @return the idRole
	 */
	public Long getIdRole() {
		return idRole;
	}

	/**
	 * @param idRole the idRole to set
	 */
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	/**
	 * @return the libelleRole
	 */
	public String getLibelleRole() {
		return libelleRole;
	}

	/**
	 * @param libelleRole the libelleRole to set
	 */
	public void setLibelleRole(String libelleRole) {
		this.libelleRole = libelleRole;
	}

	
	/**
	 * la method toString pour le debug
	 */
	public String toString() {
		return "Role [idRole=" + idRole + ", libelleRole=" + libelleRole + "]";
	}
	
	
	

}
