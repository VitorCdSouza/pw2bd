package br.com.etechoracio.pw2bd.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prof", columnDefinition = "int")
	private long idProfessor;
	
	@Column(name = "cpf_prof", columnDefinition = "char(11)")
	private String cpfProf;
	
	@Column(name = "telefone_prof")
	private String telefoneProf;
	
	@Column(name = "endereco_prof")
	private String enderecoProf;
	
	@Column(name = "nome_prof")
	private String nomeProf;    
	
	@Column(name = "salario_prof", columnDefinition = "numeric(7,2)")
	private double salarioProf;
	
	/*
	@ManyToMany
	@JoinTable(name = "aula_professor",
			joinColumns = @JoinColumn(name = "id_professor"),
			inverseJoinColumns = @JoinColumn(name = "id_aula_rel"))
	private List<Aula> aula;
	*/
}
