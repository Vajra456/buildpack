package src.main.java.com.echo.buildpack.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/api/v1")
public class BuildpackController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/status")
    String checkStatus() {
        logger.info("Test Message");
        return "Jai Jagannath";
    }
}
