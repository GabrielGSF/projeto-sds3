package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

public class AmountsSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Double sum;
	
	public AmountsSumDTO(){	
	}

	public AmountsSumDTO(Double sum) {
		this.sum = sum;
	}

	public Double getTotalAmounts() {
		return sum;
	}

	public void setTotalAmounts(Double sum) {
		this.sum = sum;
	}
	
}
