package com;

public class BridgePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
//		Shape pent = new Pentagon(new GreenColor());
//		pent.applyColor();

	}

}
