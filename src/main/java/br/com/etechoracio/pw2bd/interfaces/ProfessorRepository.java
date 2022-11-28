package br.com.etechoracio.pw2bd.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.pw2bd.entity.Aluno;
import br.com.etechoracio.pw2bd.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
