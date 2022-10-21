package com.country.demo2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")

public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer bike_id;
	public Integer getBike_id() {
		return bike_id;
	}
	public void setBike_id(Integer bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public String getBike_nooftyres() {
		return bike_nooftyres;
	}
	public void setBike_nooftyres(String bike_nooftyres) {
		this.bike_nooftyres = bike_nooftyres;
	}
	private String bike_name;
	private String bike_nooftyres;

}
