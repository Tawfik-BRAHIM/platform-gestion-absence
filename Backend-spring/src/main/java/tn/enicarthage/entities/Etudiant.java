package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="Etudiant")
public  class  Etudiant implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private long id;
	
	 
	  private String email;
	 
	 
	  private String password;
	  
	
	  private String name;
	
	 
	  private String surname;
	  
	  
	  private int isActive;

	@JsonIdentityReference(alwaysAsId = true)
	  @ManyToOne(fetch = FetchType.LAZY)
		Groupe grp;

	@JsonIdentityReference(alwaysAsId = true)
	  @OneToMany(fetch = FetchType.LAZY)
		private List<Absence> ListeAbs;
	
	  public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
	public void setIsActif(int i) {
		// TODO Auto-generated method stub
		this.isActive=i;
	}
	
	  
}