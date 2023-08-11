package hotel.reservations.hotel.controllers;

import hotel.reservations.hotel.json.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelRestController {
    
    @GetMapping("/rest") // http://localhost:8080/rest?name=Victoria
    public Greeting greet(@RequestParam(required = false, defaultValue = "World") String name) {
        return new Greeting("Hello, " + name + "!");
    }
}
