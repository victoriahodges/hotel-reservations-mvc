package hotel.reservations.hotel;

import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import hotel.reservations.hotel.json.Greeting;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

}
