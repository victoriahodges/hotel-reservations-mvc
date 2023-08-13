package hotel.reservations.hotel;

import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import hotel.reservations.hotel.json.Greeting;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HotelApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		assertNotNull(context);
		System.out.println(context.getClass().getName());
		int count = context.getBeanDefinitionCount();
		System.out.println("Bean count = " + count);
	}

	@Test
	void noGreetingBeanInAppCtx() {
		assertThrows(NoSuchBeanDefinitionException.class, 
			() -> context.getBean(Greeting.class));
	}

	@Test
	void getBeanTwice() {
		// Give bean name in context.getBean() to resolve UniqueBeanDefinitionException
		Greeting g1 = context.getBean("defaultGreeting", Greeting.class);
		Greeting g2 = context.getBean("defaultGreeting", Greeting.class);
		assertSame(g1, g2);
		System.out.println(g1);
		System.out.println(g2);
	}

}
