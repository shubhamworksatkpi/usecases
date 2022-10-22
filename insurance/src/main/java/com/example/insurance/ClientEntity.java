package com.example.insurance;
	
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="insurance_client")

	public class ClientEntity {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
		private String client_name;
		private Integer age;
		public String getInsurance_plan() {
			return insurance_plan;
		}
		public void setInsurance_plan(String insurance_plan) {
			this.insurance_plan = insurance_plan;
		}
		private String insurance_plan;
		private Integer insurance_amount;
		
		public Integer getInsurance_amount() {
			return insurance_amount;
		}
		public void setInsurance_amount(Integer insurance_amount) {
			this.insurance_amount = insurance_amount;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getClient_name() {
			return client_name;
		}
		public void setClient_name(String client_name) {
			this.client_name = client_name;
		}
		
		
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}


}
