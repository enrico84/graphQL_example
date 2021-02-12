package com.graphql.java.news.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATI_RAPPORTO")
public class DatiRapporto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RAPPORTO", length = 45)
    private String rapporto;

    @Column(name = "FILIALE", length = 5)
    private String filiale;

    @Column(name = "CATEGORIA_RAPP", length = 4)
    private String categoriaRapp;

    public String getRapporto() {
	return rapporto;
    }

    public void setRapporto(String rapporto) {
	this.rapporto = rapporto;
    }

    public String getFiliale() {
	return filiale;
    }

    public void setFiliale(String filiale) {
	this.filiale = filiale;
    }

    public String getCategoriaRapp() {
	return categoriaRapp;
    }

    public void setCategoriaRapp(String categoriaRapp) {
	this.categoriaRapp = categoriaRapp;
    }

}
