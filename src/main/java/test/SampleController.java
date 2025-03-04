package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public String index(@RequestParam(defaultValue = "false") boolean produceError) {
        if (produceError) {
            throw new NullPointerException("error");
        }
        return "Hello World";
    }
}
