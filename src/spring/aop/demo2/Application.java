package spring.aop.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("spring.aop.demo2");
		Drawing drawing = context.getBean(Drawing.class);
		drawing.drawCircle();
		drawing.drawRectangle();
		drawing.hello();

	}
}
