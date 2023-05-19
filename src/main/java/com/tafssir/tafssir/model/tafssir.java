package com.tafssir.tafssir.model;

import jakarta.persistence.*;

@Entity
@Table(name = "my_table")
public class tafssir {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer nAya;

	private Integer nTafsir;

	private String texte;

	private String tableName;

// constructors, getters and setters

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}
