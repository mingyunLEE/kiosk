package developingman.kiosk.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    @PostMapping
    public String postOrder(@RequestParam("memberId") long memberId,
                            @RequestParam("coffeeId") long SoupId) {
        String response =
                "{\"" +
                        "memberId\":\""+memberId+"\"," +
                        "\"coffeeId\":\""+SoupId+"\"" +
                        "}";
        return response;
    }

    @GetMapping
    public String getOrder(){
        System.out.println("# get Orders");

        return null;
    }
}
