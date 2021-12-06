package de.htwberlin.webtech.webtech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BucketController {

        @GetMapping(path = "/bucket")
        public ModelAndView products() {
            return new ModelAndView("cart");
        }

}
