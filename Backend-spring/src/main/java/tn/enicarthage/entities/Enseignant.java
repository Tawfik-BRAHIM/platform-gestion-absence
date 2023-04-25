package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="Enseignant")
public class Enseignant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private long id; 
	

	  private String nom;
	

	  private String prenom;
	

	  private String email;
	 

	  private String password;
	  
	  private int isActive;

	@JsonIdentityReference(alwaysAsId = true)
	  @ManyToMany(fetch = FetchType.LAZY)
		private List<Groupe> groupes;

	@JsonIdentityReference(alwaysAsId = true)
	@ManyToMany(fetch = FetchType.LAZY)
		private List<Matiere> matieres;

	public Object getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	public void setIsActif(int i) {
		// TODO Auto-generated method stub
		this.isActive=i;
	}

	
	  
	  

}
