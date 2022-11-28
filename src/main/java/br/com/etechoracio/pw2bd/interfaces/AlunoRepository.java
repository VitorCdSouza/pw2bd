package br.com.etechoracio.pw2bd.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.pw2bd.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
