package com.country.demo2;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	 
	@Entity
	@Table(name="car")
	
	public class CarEntity {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer car_id;
		public Integer getCar_id() {
			return car_id;
		}
		public void setCar_id(Integer car_id) {
			this.car_id = car_id;
		}
		public String getCar_name() {
			return car_name;
		}
		public void setCar_name(String car_name) {
			this.car_name = car_name;
		}
		public String getCar_nooftyres() {
			return car_nooftyres;
		}
		public void setCar_nooftyres(String car_nooftyres) {
			this.car_nooftyres = car_nooftyres;
		}
		private String car_name;
		private String car_nooftyres;

		
	}

