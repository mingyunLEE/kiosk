package developingman.kiosk.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/members", produces = {MediaType.APPLICATION_JSON_VALUE}) //(1)
public class MemberController {
    @PostMapping
    public String postMember(@RequestParam("email") String email, //(2),(3)
                             @RequestParam("name") String name,
                             @RequestParam("phone") String phone) {
        String response =
                "{\"" +
                        "email\":\""+email+"\"," +
                        "\"name\":\""+name+"\",\"" +
                        "phone\":\"" + phone+
                        "\"}";
        return response;
    }
    @GetMapping("/{member-id}")
    public String getMember(@PathVariable("member-id")long memberId){
        System.out.println("# memberId: " + memberId);

        return null;
    }

    @GetMapping
    public String getMembers(){
        System.out.println("# get Members");
        return null;
    }
}
