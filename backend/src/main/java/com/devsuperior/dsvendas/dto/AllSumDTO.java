package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

public class AllSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Double sum1;
	private Long sum2;
	
	public AllSumDTO(){	
	}

	public AllSumDTO(Double sum1, Long sum2) {
		this.sum1 = sum1;
		this.sum2 = sum2;
	}

	public Double getTotalDeals() {
		return sum1;
	}

	public void setTotalDeals(Double sum1) {
		this.sum1 = sum1;
	}

	public Long getTotalAmounts() {
		return sum2;
	}

	public void setTotalAmounts(Long sum2) {
		this.sum2 = sum2;
	}
	
}
