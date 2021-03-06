package pack.qualy_pro.models;
// Generated 11 janv. 2017 14:16:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Magasin generated by hbm2java
 */
public class Magasin implements java.io.Serializable {

	private int idMagasin;
	private Utilisateur utilisateur;
	private String nomMagasin;
	private String lieu;
	private String description;
	private Set<Pavillion> pavillions = new HashSet<Pavillion>(0);

	public Magasin() {
	}

	public Magasin(int idMagasin) {
		this.idMagasin = idMagasin;
	}

	public Magasin(int idMagasin, Utilisateur utilisateur, String nomMagasin,
			String lieu, String description, Set<Pavillion> pavillions) {
		this.idMagasin = idMagasin;
		this.utilisateur = utilisateur;
		this.nomMagasin = nomMagasin;
		this.lieu = lieu;
		this.description = description;
		this.pavillions = pavillions;
	}

	public int getIdMagasin() {
		return this.idMagasin;
	}

	public void setIdMagasin(int idMagasin) {
		this.idMagasin = idMagasin;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getNomMagasin() {
		return this.nomMagasin;
	}

	public void setNomMagasin(String nomMagasin) {
		this.nomMagasin = nomMagasin;
	}

	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Pavillion> getPavillions() {
		return this.pavillions;
	}

	public void setPavillions(Set<Pavillion> pavillions) {
		this.pavillions = pavillions;
	}

}
