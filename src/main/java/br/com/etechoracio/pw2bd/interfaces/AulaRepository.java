package br.com.etechoracio.pw2bd.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.pw2bd.entity.Aluno;
import br.com.etechoracio.pw2bd.entity.Aula;

public interface AulaRepository extends JpaRepository<Aula, Long>{

}
