package com.naver.lecture.ch07.apple;

import com.tt.lecture.ch07.banana.Banana;
import com.tt.lecture.ch07.banana.BananaChildPublic;
import com.tt.lecture.ch07.banana.BlueberryChildPublic;

public class AppleExample {

	public static void main(String[] args) {
		
//		--------------
		
		Apple apple = new Apple();		// public
		
		apple.strApple = "newApple";	// public
		apple.strApple2 = "newApple";	// protected
		apple.strApple3 = "newApple";	// default
		apple.strApple4 = "newApple";	// private : error
		
		apple.printApple();		// public
		apple.printApple2();	// protected
		apple.printApple3();	// default
		apple.printApple4();	// private : error
		
		
//		--------------		
		AppleChildPublic appleChildPublic = new AppleChildPublic();
		
		appleChildPublic.strApple = "newApple";	// public
		appleChildPublic.strApple2 = "newApple";	// protected
		appleChildPublic.strApple3 = "newApple";	// default
		appleChildPublic.strApple4 = "newApple";	// private : error
		
		appleChildPublic.printApple();		// public
		appleChildPublic.printApple2();	// protected
		appleChildPublic.printApple3();	// default
		appleChildPublic.printApple4();	// private : error
		
		appleChildPublic.strAppleChildPublic = "newApple";		// public
		appleChildPublic.strAppleChildPublic2 = "newApple";		// protected
		appleChildPublic.strAppleChildPublic3 = "newApple";		// default
		appleChildPublic.strAppleChildPublic4 = "newApple";		// private : error
		
		appleChildPublic.printAppleChildPublic();			// public
		appleChildPublic.printAppleChildPublic2();		// protected
		appleChildPublic.printAppleChildPublic3();		// default
		appleChildPublic.printAppleChildPublic4();		// private : error
		

//		--------------	
		AppleChildDefault appleChildDefault = new AppleChildDefault();
		
		appleChildDefault.strApple = "newApple";	// public
		appleChildDefault.strApple2 = "newApple";	// protected
		appleChildDefault.strApple3 = "newApple";	// default
		appleChildDefault.strApple4 = "newApple";	// private : error
		
		appleChildDefault.printApple();		// public
		appleChildDefault.printApple2();	// protected
		appleChildDefault.printApple3();	// default
		appleChildDefault.printApple4();	// private : error
		
		appleChildDefault.strAppleChildDefault = "newApple";		// public
		appleChildDefault.strAppleChildDefault2 = "newApple";		// protected
		appleChildDefault.strAppleChildDefault3 = "newApple";		// default
		appleChildDefault.strAppleChildDefault4 = "newApple";		// private : error
		
		appleChildDefault.printAppleChildDefault();			// public
		appleChildDefault.printAppleChildDefault2();		// protected
		appleChildDefault.printAppleChildDefault3();		// default
		appleChildDefault.printAppleChildDefault4();		// private : error
		

//		--------------
		Aloe aloe = new Aloe();		// default
		
		aloe.strAloe = "newAloe";	// public
		aloe.strAloe2 = "newAloe";	// protected
		aloe.strAloe3 = "newAloe";	// default
		aloe.strAloe4 = "newAloe";	// private : error
		
		aloe.printAloe();		// public
		aloe.printAloe2();	// protected
		aloe.printAloe3();	// default
		aloe.printAloe4();	// private : error
		
		// Aloe 를 상속 받고 private 로 선언된 AloeChild
		AloeChildPublic aloeChildPublic = new AloeChildPublic();
		
		aloeChildPublic.strAloe = "newAloe";	// public
		aloeChildPublic.strAloe2 = "newAloe";	// protected
		aloeChildPublic.strAloe3 = "newAloe";	// default
		aloeChildPublic.strAloe4 = "newAloe";	// private : error
		
		aloeChildPublic.printAloe();		// public
		aloeChildPublic.printAloe2();	// protected
		aloeChildPublic.printAloe3();	// default
		aloeChildPublic.printAloe4();	// private : error
		
		aloeChildPublic.strAloeChildPublic = "newAloe";		// public
		aloeChildPublic.strAloeChildPublic2 = "newAloe";		// protected
		aloeChildPublic.strAloeChildPublic3 = "newAloe";		// default
		aloeChildPublic.strAloeChildPublic4 = "newAloe";		// private : error
		
		aloeChildPublic.printAloeChildPublic();			// public
		aloeChildPublic.printAloeChildPublic2();		// protected
		aloeChildPublic.printAloeChildPublic3();		// default
		aloeChildPublic.printAloeChildPublic4();		// private : error
		

		
//		--------------
		AloeChildDefault aloeChildDefault = new AloeChildDefault();
		
		aloeChildDefault.strAloe = "newAloe";	// public
		aloeChildDefault.strAloe2 = "newAloe";	// protected
		aloeChildDefault.strAloe3 = "newAloe";	// default
		aloeChildDefault.strAloe4 = "newAloe";	// private : error
		
		aloeChildDefault.printAloe();		// public
		aloeChildDefault.printAloe2();	// protected
		aloeChildDefault.printAloe3();	// default
		aloeChildDefault.printAloe4();	// private : error
		
		aloeChildDefault.strAloeChildDefault = "newAloe";		// public
		aloeChildDefault.strAloeChildDefault2 = "newAloe";		// protected
		aloeChildDefault.strAloeChildDefault3 = "newAloe";		// default
		aloeChildDefault.strAloeChildDefault4 = "newAloe";		// private : error
		
		aloeChildDefault.printAloeChildDefault();			// public
		aloeChildDefault.printAloeChildDefault2();		// protected
		aloeChildDefault.printAloeChildDefault3();		// default
		aloeChildDefault.printAloeChildDefault4();		// private : error
		

//		--------------
		
		Banana banana = new Banana();		// public
		
		banana.strBanana = "newBanana";	// public
		banana.strBanana2 = "newBanana";	// protected
		banana.strBanana3 = "newBanana";	// default
		banana.strBanana4 = "newBanana";	// private : error
		
		banana.printBanana();		// public
		banana.printBanana2();	// protected
		banana.printBanana3();	// default
		banana.printBanana4();	// private : error
		
		
//		--------------		
		BananaChildPublic bananaChildPublic = new BananaChildPublic();
		
		bananaChildPublic.strBanana = "newBanana";	// public
		bananaChildPublic.strBanana2 = "newBanana";	// protected
		bananaChildPublic.strBanana3 = "newBanana";	// default
		bananaChildPublic.strBanana4 = "newBanana";	// private : error
		
		bananaChildPublic.printBanana();		// public
		bananaChildPublic.printBanana2();	// protected
		bananaChildPublic.printBanana3();	// default
		bananaChildPublic.printBanana4();	// private : error
		
		bananaChildPublic.strBananaChildPublic = "newBanana";		// public
		bananaChildPublic.strBananaChildPublic2 = "newBanana";		// protected
		bananaChildPublic.strBananaChildPublic3 = "newBanana";		// default
		bananaChildPublic.strBananaChildPublic4 = "newBanana";		// private : error
		
		bananaChildPublic.printBananaChildPublic();			// public
		bananaChildPublic.printBananaChildPublic2();		// protected
		bananaChildPublic.printBananaChildPublic3();		// default
		bananaChildPublic.printBananaChildPublic4();		// private : error
		

//		--------------	
		BananaChildDefault bananaChildDefault = new BananaChildDefault();
		
		bananaChildDefault.strBanana = "newBanana";	// public
		bananaChildDefault.strBanana2 = "newBanana";	// protected
		bananaChildDefault.strBanana3 = "newBanana";	// default
		bananaChildDefault.strBanana4 = "newBanana";	// private : error
		
		bananaChildDefault.printBanana();		// public
		bananaChildDefault.printBanana2();	// protected
		bananaChildDefault.printBanana3();	// default
		bananaChildDefault.printBanana4();	// private : error
		
		bananaChildDefault.strBananaChildDefault = "newBanana";		// public
		bananaChildDefault.strBananaChildDefault2 = "newBanana";		// protected
		bananaChildDefault.strBananaChildDefault3 = "newBanana";		// default
		bananaChildDefault.strBananaChildDefault4 = "newBanana";		// private : error
		
		bananaChildDefault.printBananaChildDefault();			// public
		bananaChildDefault.printBananaChildDefault2();		// protected
		bananaChildDefault.printBananaChildDefault3();		// default
		bananaChildDefault.printBananaChildDefault4();		// private : error		
		
		
		
//		--------------
		
		Blueberry blueberry = new Blueberry();		// default
		
		blueberry.strBlueberry = "newBlueberry";	// public
		blueberry.strBlueberry2 = "newBlueberry";	// protected
		blueberry.strBlueberry3 = "newBlueberry";	// default
		blueberry.strBlueberry4 = "newBlueberry";	// private : error
		
		blueberry.printBlueberry();		// public
		blueberry.printBlueberry2();	// protected
		blueberry.printBlueberry3();	// default
		blueberry.printBlueberry4();	// private : error
		
		
//		--------------		
		BlueberryChildPublic blueberryChildPublic = new BlueberryChildPublic();
		
		blueberryChildPublic.strBlueberry = "newBlueberry";	// public
		blueberryChildPublic.strBlueberry2 = "newBlueberry";	// protected
		blueberryChildPublic.strBlueberry3 = "newBlueberry";	// default
		blueberryChildPublic.strBlueberry4 = "newBlueberry";	// private : error
		
		blueberryChildPublic.printBlueberry();		// public
		blueberryChildPublic.printBlueberry2();	// protected
		blueberryChildPublic.printBlueberry3();	// default
		blueberryChildPublic.printBlueberry4();	// private : error
		
		blueberryChildPublic.strBlueberryChildPublic = "newBlueberry";		// public
		blueberryChildPublic.strBlueberryChildPublic2 = "newBlueberry";		// protected
		blueberryChildPublic.strBlueberryChildPublic3 = "newBlueberry";		// default
		blueberryChildPublic.strBlueberryChildPublic4 = "newBlueberry";		// private : error
		
		blueberryChildPublic.printBlueberryChildPublic();			// public
		blueberryChildPublic.printBlueberryChildPublic2();		// protected
		blueberryChildPublic.printBlueberryChildPublic3();		// default
		blueberryChildPublic.printBlueberryChildPublic4();		// private : error
		

//		--------------	
		BlueberryChildDefault blueberryChildDefault = new BlueberryChildDefault();
		
		blueberryChildDefault.strBlueberry = "newBlueberry";	// public
		blueberryChildDefault.strBlueberry2 = "newBlueberry";	// protected
		blueberryChildDefault.strBlueberry3 = "newBlueberry";	// default
		blueberryChildDefault.strBlueberry4 = "newBlueberry";	// private : error
		
		blueberryChildDefault.printBlueberry();		// public
		blueberryChildDefault.printBlueberry2();	// protected
		blueberryChildDefault.printBlueberry3();	// default
		blueberryChildDefault.printBlueberry4();	// private : error
		
		blueberryChildDefault.strBlueberryChildDefault = "newBlueberry";		// public
		blueberryChildDefault.strBlueberryChildDefault2 = "newBlueberry";		// protected
		blueberryChildDefault.strBlueberryChildDefault3 = "newBlueberry";		// default
		blueberryChildDefault.strBlueberryChildDefault4 = "newBlueberry";		// private : error
		
		blueberryChildDefault.printBlueberryChildDefault();			// public
		blueberryChildDefault.printBlueberryChildDefault2();		// protected
		blueberryChildDefault.printBlueberryChildDefault3();		// default
		blueberryChildDefault.printBlueberryChildDefault4();		// private : error	

	}

}
