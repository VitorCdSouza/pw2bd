package br.com.etechoracio.pw2bd.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import br.com.etechoracio.pw2bd.enums.Periodo;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso", columnDefinition = "int")
	private long idCurso;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "periodo_curso")
	private Periodo periodoCurso;
	
	@Column(name = "nome_curso")
	private String nomeCurso;
	
	@Column(name = "preco_curso", columnDefinition = "numeric(6,2)")
	private double precoCurso;
	
	@Column(name = "data_fim_curso")
	private LocalDate dataFimCurso;
	
	@Column(name = "data_inicio_curso")
	private LocalDate dataInicioCurso;
	
	@ManyToMany
	@JoinTable(name = "uni_curso",
			joinColumns = @JoinColumn(name = "id_curso_rel"),
			inverseJoinColumns = @JoinColumn(name = "id_unid_rel"))
	private List<UnidUniver> unidUniver;
}
