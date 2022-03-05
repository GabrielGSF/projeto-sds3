package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

public class DealsSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long sum;
	
	public DealsSumDTO(){	
	}

	public DealsSumDTO(Long sum) {
		this.sum = sum;
	}

	public Long getTotalDeals() {
		return sum;
	}

	public void setTotalDeals(Long sum) {
		this.sum = sum;
	}
	
}
