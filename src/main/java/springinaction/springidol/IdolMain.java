package springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IdolMain {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext("springinaction/resouces/springidol.xml");
		Poem sonnet29 = new Sonnet29();
		Performer duke = new PoeticJuggler(15, sonnet29);
		duke.perform();
		}


}
