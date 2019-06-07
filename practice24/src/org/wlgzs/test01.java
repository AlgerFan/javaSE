package org.wlgzs;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class test01 {
	public static void main(String[] args) {
		double we = 3.1415926;
		BigDecimal ac = new BigDecimal(we);
		double two = ac.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(two);
		DecimalFormat df = new DecimalFormat("0.00%");
		String r = df.format(we);
		System.out.println(r);
	}
}
