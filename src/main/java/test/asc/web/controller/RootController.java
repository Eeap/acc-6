package test.asc.web.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    // 코드 삽입!
    @GetMapping("/health")
    public String tempAPi(){
        return "hi!";
    }

}
