package com.example;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Nadhem Jemmali
 */
@CrossOrigin(origins = "*")
@RestController
public class AppController {


    @GetMapping("/hi")
    public String getHi(@RequestHeader HttpHeaders headers) {
        return "hello";
    }

    @PostMapping(value = "hi")
    public String postHi(@RequestHeader HttpHeaders headers, HttpServletRequest request) throws IOException, InterruptedException {
        return request.getHeader("Content-Length");
    }

}
