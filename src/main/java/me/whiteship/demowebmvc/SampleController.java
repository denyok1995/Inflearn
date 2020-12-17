package me.whiteship.demowebmvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
public class SampleController {

    //@RequestMapping(value="/hello", method= {RequestMethod.GET, RequestMethod.PUT})
    @RequestMapping(value="/hello", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody // 그대로 전달
    public String hello() {
        return "hello";
    }
}
