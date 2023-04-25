package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table (name = "GROUPE")
public class Groupe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  @Id

	  private String id; 
	 
		@Enumerated
	private EnumGrp libelle;
	

	private int promotion ;
	

	private int niveau ;
	 
		@Enumerated

	private EnumSpec spec ;

	@JsonIdentityReference(alwaysAsId =true )
	@ManyToOne(fetch = FetchType.LAZY)
	private Departement depart ;

	@JsonIdentityReference(alwaysAsId = true)
	@OneToMany(fetch = FetchType.LAZY)
	private List<Etudiant> etudiants;


	 

}