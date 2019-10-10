package za.ac.cput.SpazaAuto10.SpazaAuto10.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class HomeController {

        @RequestMapping(value = {"/", "/SpazaAuto10"})
        public ResponseEntity<String> home() {
            return new ResponseEntity<>("Welcome to Spaza Automation System App!", HttpStatus.OK);
        }
    }
