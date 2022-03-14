package com.naver.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {

		Product<String, Integer> product = new Product<>();

		product.setKind("벤츠");
		product.setModel(400);
		
		System.out.println("내가 선물 받고 싶은 차는" + product.getKind() + "-" + product.getModel());
	

		Product<Tv, String> product2 = new Product<>(); // Tv는 객체임
//		Tv tv = new Tv();
//		product2.setKind(tv);
//		tv = product2.getKind();
		
		product2.setKind(new Tv()); 
		product2.setModel("OLED TV");
		// product2 -> setKind -> field로 대입됨
		
		System.out.println("이건" + product2.getKind() + " - " + product2.getModel());
		
		
		Product<Car, String> product3 = new Product<>();
		
		product3.setKind(new Car());
		product3.setModel("Volvo");
		
		Car car = product3.getKind();
		String string2 = product3.getModel();
		
		System.out.println(car + string2);
		
	}
}
