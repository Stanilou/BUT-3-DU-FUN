package com.iut.collaborateurs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "collaborateurs")
public class Collaborateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_collaborateur")
	private int id;
	@Column(name = "matricule_collaborateur")
    private String matricule;
	@Column(name = "nom_collaborateur")
    private String nom;
	@Column(name = "prenom_collaborateur")
    private String prenom;
	@Column(name = "adresse_postale_collaborateur")
    private String adressePostale;
	@Column(name = "email_professionnel_collaborateur")
    private String emailProfessionnel;
	@Column(name = "numero_securite_sociale_collaborateur")
    private String numeroSecuriteSociale;
	@Column(name = "photo_url_collaborateur")
    private String photoUrl;
	@Column(name = "activite_collaborateur")
    private boolean actif;
	@Column(name = "poste_collaborateur")
    private String poste;
	@Column(name = "id_departement_collaborateur")
    private int departementId;
	@Column(name = "civilite_collaborateur")
    private String civilite;
	@Column(name = "nom_banque_collaborateur")
    private String nomBanque;
	@Column(name = "bic_collaborateur")
    private String bic;
	@Column(name = "ban_collaborateur")
    private String ban;

    public Collaborateur() {
    }
    
    public Collaborateur(int id, String matricule, String nom, String prenom, boolean actif) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.actif = actif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getEmailProfessionnel() {
        return emailProfessionnel;
    }

    public void setEmailProfessionnel(String emailProfessionnel) {
        this.emailProfessionnel = emailProfessionnel;
    }

    public String getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getDepartementId() {
        return departementId;
    }

    public void setDepartementId(int departementId) {
        this.departementId = departementId;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }
	
}
