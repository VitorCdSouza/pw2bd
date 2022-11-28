package br.com.etechoracio.pw2bd.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "sala")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sala", columnDefinition = "int")
	private long idSala;
	
	@Column(name = "numero_sala", columnDefinition = "char(2)")
	private String numeroSala;
	
	@Column(name = "andar_sala", columnDefinition = "char(2)")
	private String andarSala;
	
	@Column(name = "tamanho_sala", columnDefinition = "numeric(5,2)")
	private double tamanhoSala;
	
	/*
	@ManyToMany
	@JoinTable(name = "aula_sala",
			joinColumns = @JoinColumn(name = "id_sala"),
			inverseJoinColumns = @JoinColumn(name = "id_aula_rel"))
	private List<Aula> aula;
	*/
	
}
