package spring.aop.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Drawing {

	public void drawCircle() {
		System.out.println("Cricle is drawn");
	}

	public void drawRectangle() {
		System.out.println("Rectangle is drawn");
	}
	
	public void hello() {
		System.out.println("Says Hello");
	}
	
	
	public void draw(String shape) {
		
	}

}
