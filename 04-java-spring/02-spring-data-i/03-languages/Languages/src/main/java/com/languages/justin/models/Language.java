package com.languages.justin.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table
public class Language {
	@Id
	@GeneratedValue
	private Long Id;
	@Size(min = 1, max = 200)
	private String name;
	@Size(min = 1, max = 30)
	private String creator;
	@Size(min = 1, max = 45)
	private Double version;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	
	public Language() {
	}
	
	public Language(String name, String creator, Double version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}
    
    
}
