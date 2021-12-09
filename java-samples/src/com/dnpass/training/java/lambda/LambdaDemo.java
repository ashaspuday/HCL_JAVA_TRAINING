package com.dnpass.training.java.lambda;

public class LambdaDemo {
	
	interface Drawable {
		void draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int width = 2;
		Drawable d1 = ()->{System.out.println("Drawing :"+width);
			};
			
			d1.draw();
	}

}
