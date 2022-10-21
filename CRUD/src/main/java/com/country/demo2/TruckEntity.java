package com.country.demo2;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name="truck")

public class TruckEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer truck_id;
	public Integer getTruck_id() {
		return truck_id;
	}
	public void setTruck_id(Integer truck_id) {
		this.truck_id = truck_id;
	}
	public String getTruck_name() {
		return truck_name;
	}
	public void setTruck_name(String truck_name) {
		this.truck_name = truck_name;
	}
	public String getTruck_nooftyres() {
		return truck_nooftyres;
	}
	public void setTruck_nooftyres(String truck_nooftyres) {
		this.truck_nooftyres = truck_nooftyres;
	}
	private String truck_name;
	private String truck_nooftyres;

}
