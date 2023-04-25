package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table (name = "Matiere")
public class  Matiere implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  @Id
	  private String id; 

	private String nom;
	  

	  private int nbSeance;

	@JsonIdentityReference(alwaysAsId = true)
	  @ManyToMany(fetch = FetchType.LAZY)
		private List<Groupe> groupes;

	@JsonIdentityReference(alwaysAsId = true)
	  @ManyToMany(fetch = FetchType.LAZY)
		private List<Enseignant> enseignants;

	@JsonIdentityReference(alwaysAsId = true)
	  @OneToMany(fetch = FetchType.LAZY)
		private List<Absence> ListeAbs;

}
