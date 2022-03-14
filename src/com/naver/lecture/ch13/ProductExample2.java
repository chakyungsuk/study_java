package com.naver.lecture.ch13;

public class ProductExample2 {

	public static void main(String[] args) {

		Product<Car, Integer> product = new Product<>();
		product.setKind(new Car());
		product.setModel(450);
		
		Car rtCar = product.getKind();
		int rtInt = product.getModel();
		
		System.out.println(rtCar + ":" + rtInt);
		
		
		Product<Car, Tv> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel(new Tv());
		
		Car rtCar2 = product2.getKind();
		Tv rtTv2 = product2.getModel();
		
		System.out.println(rtCar2 + " - " + rtTv2);
	}

}
