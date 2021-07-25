package ro.fasttrackit.simple.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("simple")
public class SimpleController {
    @GetMapping
    String simple() {
        return "simple";
    }
}
