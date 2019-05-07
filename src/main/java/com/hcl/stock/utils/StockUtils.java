package com.hcl.stock.utils;

public class StockUtils {

	public static Double calculateComission(Integer quantity, Double price) {
		Double comissionAmount = 0d;
		if (quantity < 500) {
			comissionAmount = (quantity * price) + ((quantity) * 0.001);
		} else {
			if (quantity % 100 == 0)
				comissionAmount = (quantity * price) + ((quantity / 100) * 0.0015);
			else {
				comissionAmount = (quantity * price) + ((quantity / 100) * 0.0015) + 0.0015;
			}
		}

		return comissionAmount;
	}

	public static void main(String[] args) {
		System.err.println(calculateComission(600, 15.0));
	}

}
