package br.com.etechoracio.pw2bd.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.pw2bd.entity.Aluno;
import br.com.etechoracio.pw2bd.entity.UnidUniver;

public interface UnidUniverRepository extends JpaRepository<UnidUniver, Long>{

}
