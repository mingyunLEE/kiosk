package developingman.kiosk.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/soups", produces = {MediaType.APPLICATION_JSON_VALUE})
public class SoupController {
    @PostMapping
    public String postSoup(@RequestParam("name") String name,
                           @RequestParam("price") String price){
        String response =
                "{\"" +
                        "\"name\":\""+name+"\",\"" +
                        "phone\":\"" + price+
                        "\"}";
        return response;
    }
    @GetMapping("/{soup-id")
    public String getSoup(@PathVariable("soup-id")long soupId){
        System.out.println("# SoupId: " + soupId);

        return null;
    }

    @GetMapping
    public String getSoups(){
        System.out.println("# get Soups");

        return null;
    }
}
