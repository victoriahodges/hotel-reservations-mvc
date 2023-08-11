package hotel.reservations.hotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelController {
    
    @GetMapping("/hello") // http://localhost:8080/hello?name=Victoria
    public String hello(
        @RequestParam(name="name", required=false, 
                defaultValue="World") String name, Model model) {
        model.addAttribute("user", name);
        return "hello"; // look for index.html in src/main/resources/templates folder
    }
}
