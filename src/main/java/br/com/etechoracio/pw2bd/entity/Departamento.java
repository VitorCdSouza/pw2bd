package br.com.etechoracio.pw2bd.entity;

import javax.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dep", columnDefinition = "int")
	private long idDep;
	
	@Column(name = "telefone_dep")
	private String telefoneDep;
	
	@Column(name = "nome_dep")
	private String nomeDep;
	
	@OneToOne
	@JoinColumn(name = "id_unid_dep", referencedColumnName = "id_unid", columnDefinition = "int")
	private UnidUniver unid;
}
