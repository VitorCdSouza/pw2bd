package br.com.etechoracio.pw2bd.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "unid_univer")
public class UnidUniver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_unid", columnDefinition = "int")
	private long idUnid;
	
	@Column(name = "telefone_unid")
	private String telefoneUnid;
	
	@Column(name = "endereco_unid")
	private String enderecoUnid;
	
	@Column(name = "lucro_mensal", columnDefinition = "numeric(7, 2)")
	private double lucroMensal;
	
	@Column(name = "meses_ativo", columnDefinition = "numeric(3)")
	private int mesesAtivo;
	
	/*
	@ManyToMany
	@JoinTable(name = "uni_curso",
			joinColumns = @JoinColumn(name = "id_unid"),
			inverseJoinColumns = @JoinColumn(name = "id_curso_rel"))
	private List<Curso> curso;
	*/
	
	@Transient
	private double lucroTotal;
	
	public void calcularLucro() {
		lucroTotal = lucroMensal * mesesAtivo;
	} 
}
