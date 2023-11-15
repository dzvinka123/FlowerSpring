package ucu.edu.ua.lab7.flowerspring.src.delivery;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "delivery")
public class DeliveryController {

    @GetMapping
    public String getDeliveries() {
        return "At the moment, our store offers product delivery options through postal services or DHL.";
    }
}