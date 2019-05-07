package com.hcl.stock.utils;

public class StockUtils {

	public static Double calculateComission(Integer quantity, Double price) {
		Double comissionAmount = 0d;
		if (quantity <= 500) {
			comissionAmount =  ((quantity * price) * 1.5);
		}
		else
		{
			comissionAmount = ((quantity * price) * 0.5);
		}
		
		return comissionAmount;
	}

}
