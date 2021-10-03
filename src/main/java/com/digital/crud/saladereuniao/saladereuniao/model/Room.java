package com.digital.crud.saladereuniao.saladereuniao.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Sinalizar para o hibernates e spring que é uma  classe de configuração dá entidade
@Table(name="meetingroom") //nome da tablea

public class Room {
	
	private long id;
	private String name;
	private String date;
	private String startHour;
	private String endHour;
	
	public Room() {
		
	}
	
	public Room(long id, String name, String date, String startHour, String endHour) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.startHour = startHour;
		this.endHour = endHour;
	}
	
	@Id //indicando que o método em questão é o Id
	@GeneratedValue(strategy = GenerationType.AUTO) // O id é incrementado automaticamente
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="name", nullable = false) // transformado o campo em coluna no BD
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getStartHour() {
		return startHour;
	}
	
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	
	public String getEndHour() {
		return endHour;
	}
	
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	
	
	
	
		
}
