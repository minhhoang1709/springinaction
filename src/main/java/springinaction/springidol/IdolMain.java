package springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IdolMain {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/springinaction/resouces/springidol.xml");
				Performer performer = (Performer) ctx.getBean("hankv2");
				performer.perform();

	}
}
