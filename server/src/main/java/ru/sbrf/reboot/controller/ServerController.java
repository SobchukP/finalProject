package ru.sbrf.reboot.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.reboot.Response;
import ru.sbrf.reboot.Request;

import java.math.BigDecimal;

@Data
@RestController
public class ServerController {

    @PostMapping("/balance")
    public Response getBalance(Request request){
        Response response = new Response(BigDecimal.ZERO);
        return response;
    }

    @GetMapping("/state")
    public String getStatusServer(){
        return "success";
    }
}
