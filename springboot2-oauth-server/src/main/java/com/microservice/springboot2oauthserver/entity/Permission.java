package com.microservice.springboot2oauthserver.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Permission")
public class Permission extends BaseIdEntity {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
