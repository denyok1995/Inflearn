package me.whiteship.demowebmvc;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import java.time.ZoneId;
import java.util.Locale;
import java.util.TimeZone;

@Controller
public class SampleController {

    @GetMapping("/events/{id}")
    @ResponseBody //응답 본문에 작성
    public Event getEvent(@PathVariable int id, @MatrixVariable String name){
        Event event = new Event();
        event.setId(id);
        event.setName(name);
        return event;
    }

}
