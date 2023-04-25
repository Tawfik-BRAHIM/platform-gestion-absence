package tn.enicarthage.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Admin implements Serializable{

	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
		  
		private long cin; 
		
		
		  private String name;
		
		
		  private String surname;
		
		
		  private String email;
		 
		 
		  private String password;
		  
		  private int isActive;

		public String getPassword() {
			// TODO Auto-generated method stub
			return this.password;
		}

		public void setIsActif(int i) {
			// TODO Auto-generated method stub
			this.isActive=i;
		}
		  
}
