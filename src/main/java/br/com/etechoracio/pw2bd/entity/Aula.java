package br.com.etechoracio.pw2bd.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "aula")
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aula", columnDefinition = "int")
	private long idAula;
	
	@Column(name = "duracao_aula", columnDefinition = "char(4)")
	private String duracaoAula;
	
	@Column(name = "horario_aula", columnDefinition = "char(4)")
	private String horaraioAula;
	
	@OneToOne
	@JoinColumn(name = "id_curso_aula", referencedColumnName = "id_curso", columnDefinition = "int")
	private Curso curso;
	
	@ManyToMany
	@JoinTable(name = "aula_professor",
			joinColumns = @JoinColumn(name = "id_aula_rel"),
			inverseJoinColumns = @JoinColumn(name = "id_prof_rel"))
	private List<Professor> professor;

	@ManyToMany
	@JoinTable(name = "aula_sala",
			joinColumns = @JoinColumn(name = "id_aula_rel"),
			inverseJoinColumns = @JoinColumn(name = "id_sala_rel"))
	private List<Sala> sala;
}
