package br.com.etechoracio.pw2bd.entity;

import javax.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluno", columnDefinition = "int")
	private long idAluno;
	
	@Column(name = "cpf_aluno", columnDefinition = "char(11)")
	private String cpfAluno;
	
	@Column(name = "endereco_aluno")
	private String enderecoAluno;
	
	@Column(name = "telefone_aluno")
	private String telefoneAluno;
	
	@Column(name = "nome_aluno")
	private String nomeAluno;
	
	@Column(name = "numero_matricula", columnDefinition = "numeric(10)")
	private int numeroMatricula;
	
	@OneToOne
	@JoinColumn(name = "id_curso_aluno", referencedColumnName = "id_curso", columnDefinition = "int")
	private Curso curso;
}
