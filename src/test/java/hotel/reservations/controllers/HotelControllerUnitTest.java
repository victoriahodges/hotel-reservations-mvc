package hotel.reservations.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import hotel.reservations.hotel.controllers.HotelController;

import static org.junit.jupiter.api.Assertions.*;

public class HotelControllerUnitTest {
    @Test
    public void testIndex() {
        HotelController controller = new HotelController();
        Model model = new BindingAwareModelMap();
        String result = controller.hello("World", model);
        assertAll(
            () -> assertEquals("World", model.getAttribute("user")),
            () -> assertEquals("hello", result)
        );
    }
    
}
