package es.mpastor.petancaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    /**
     * Redirect to the index page.
     * @return The index page.
     */
    @GetMapping("/")
    public String getIndex() {
        return "templates/index.html";
    }
}
