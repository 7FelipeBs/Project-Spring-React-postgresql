package com.felipebs.financialControl.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipebs.financialControl.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
}
