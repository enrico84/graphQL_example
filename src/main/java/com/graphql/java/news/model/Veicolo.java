package com.graphql.java.news.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Veicolo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "model_code", nullable = false)
    private String modelCode;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "launch_date")
    private LocalDate launchDate;

    private transient String formattedDate;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getModelCode() {
	return modelCode;
    }

    public void setModelCode(String modelCode) {
	this.modelCode = modelCode;
    }

    public String getBrandName() {
	return brandName;
    }

    public void setBrandName(String brandName) {
	this.brandName = brandName;
    }

    public LocalDate getLaunchDate() {
	return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
	this.launchDate = launchDate;
    }

    public String getFormattedDate() {
	return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
	this.formattedDate = formattedDate;
    }

    public static long getSerialversionuid() {
	return serialVersionUID;
    }

}
