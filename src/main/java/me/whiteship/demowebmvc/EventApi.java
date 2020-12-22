package me.whiteship.demowebmvc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/api/events")
public class EventApi {

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody @Valid Event event, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(event);
    }
}
