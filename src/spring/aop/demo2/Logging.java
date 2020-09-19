package spring.aop.demo2;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {

	/*
	 * // @Before("execution(public void drawCircle())")
	 * 
	 * @Before("pointCutForDrawMethods()") public void logDrawing() {
	 * System.out.println("draw method is called.\t" + new Date()); }
	 * 
	 * @After("pointCutForDrawMethods()") public void logDrawingAfterExecution() {
	 * System.out.println("draw method execution is completed.\t" + new Date()); }
	 * 
	 * @Pointcut("execution(public void draw*())") public void
	 * pointCutForDrawMethods() { }
	 */

	/*
	 * @Before("pointCut()") public void second() {
	 * System.out.println("Second method for drawCircle is called"); }
	 * 
	 * @Before("pointCut()") public void first() {
	 * System.out.println("First method for drawCalled called"); }
	 */

	// @Before("execution(public void spring.aop.demo2.Drawing.*())")
	@Before("within(spring.aop.demo2.Drawing)")
	public void aMethodInDrawing() {
		System.out.println("A method is executed in drawing class ");
	}

	/*
	 * @Pointcut("execution(public void drawCircle())") public void pointCut() {
	 * 
	 * }
	 */

}
