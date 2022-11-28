package br.com.etechoracio.pw2bd;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.pw2bd.entity.*;
import br.com.etechoracio.pw2bd.enums.Periodo;
import br.com.etechoracio.pw2bd.interfaces.*;

@SpringBootApplication
public class Pw2BdApplication implements CommandLineRunner{

	@Autowired
	private AlunoRepository repoAluno;
	
	@Autowired
	private AulaRepository repoAula;
	
	@Autowired
	private CursoRepository repoCurso;
	
	@Autowired
	private DepartamentoRepository repoDep;
	
	@Autowired
	private ProfessorRepository repoProf;
	
	@Autowired
	private SalaRepository repoSala;
	
	@Autowired
	private UnidUniverRepository repoUnidUniver;
	
	public static void main(String[] args) {
		SpringApplication.run(Pw2BdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Criando Unidades de Universidade
		UnidUniver u1 = UnidUniver.builder().idUnid(1)
				.telefoneUnid("1145237845")
				.enderecoUnid("Rua dos MB")
				.lucroMensal(78459.78)
				.mesesAtivo(36)
				.build();
		u1.calcularLucro();
		UnidUniver u2 = UnidUniver.builder().telefoneUnid("1145237845")
				.enderecoUnid("Rua dos Cavalo")
				.lucroMensal(19459.78)
				.mesesAtivo(20)
				.build();
		u2.calcularLucro();
		
		UnidUniver u3 = UnidUniver.builder().telefoneUnid("1145237845")
				.enderecoUnid("Rua do Jose")
				.lucroMensal(8459.78)
				.mesesAtivo(15)
				.build();
		u3.calcularLucro();
		List<UnidUniver> universidades = List.of(u1);
		System.out.println(universidades.get(0).getIdUnid());
		repoUnidUniver.saveAll(universidades);
		
		
		
		Departamento d1 = Departamento.builder().telefoneDep("1178941234").nomeDep("Ulisses").build();
		repoDep.save(d1);
		
		
		Curso c1 = Curso.builder().periodoCurso(Periodo.MANHA).nomeCurso("T.I.")
				.precoCurso(1384.89).dataFimCurso(LocalDate.of(2022, 07, 22))
				.unidUniver(universidades)
				.dataInicioCurso(LocalDate.of(2023, 07, 22))
				.unidUniver(universidades)
				.build();
		repoCurso.save(c1);
		
		
		Sala s1 = Sala.builder().numeroSala("75").andarSala("2").tamanhoSala(150.50).build();
		List<Sala> salas = List.of(s1);
		repoSala.saveAll(salas);
		
		Professor p1 = Professor.builder().cpfProf("45678912311").telefoneProf("1145671234")
				.enderecoProf("Rua dos MB")
				.nomeProf("Marinho")
				.salarioProf(4655.78)
				.build();
		List<Professor> professores = List.of(p1);
		repoProf.saveAll(professores);
		
		Aula au1 = Aula.builder().duracaoAula("50").horaraioAula("710").curso(c1).sala(salas)
				.professor(professores).build();
		repoAula.save(au1);
		
		Aluno a1 = Aluno.builder()
				.cpfAluno("13245678911")
				.enderecoAluno("Rua ashudtiua")
				.telefoneAluno("1123457845")
				.nomeAluno("Jose da Silva").curso(c1).build();
		repoAluno.save(a1);
		
		
	}

}
