package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.AllSumDTO;
import com.devsuperior.dsvendas.dto.AmountsSumDTO;
import com.devsuperior.dsvendas.dto.DealsSumDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amauntGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.DealsSumDTO(SUM(obj.deals)) "
			+ " FROM Sale AS obj")
	List<DealsSumDTO> allDeals();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.AmountsSumDTO(SUM(obj.amount)) "
			+ " FROM Sale AS obj")
	List<AmountsSumDTO> allAmounts();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.AllSumDTO(SUM(obj.amount), SUM(obj.deals)) "
			+ " FROM Sale AS obj")
	List<AllSumDTO> allsSum();
}
