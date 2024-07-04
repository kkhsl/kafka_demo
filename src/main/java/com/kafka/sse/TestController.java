package com.kafka.sse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HKK
 * @version 1.0
 * @date 2024-06-22 11:05
 */
@RequestMapping("/admin/user/html")
@Controller
public class TestController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/sseHtml")
    public String sse() {
        return "sse";
    }

}
