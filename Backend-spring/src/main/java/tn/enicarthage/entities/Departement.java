package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

	@Table (name = "DEPARTEMENT")
	public class Departement implements Serializable {
	   
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
	    private EnumDep id;

	@JsonIdentityReference(alwaysAsId = true)
	@OneToMany(fetch = FetchType.LAZY)
		private List<Groupe> groupe;
		
	}

