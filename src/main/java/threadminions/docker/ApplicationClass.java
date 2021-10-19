package threadminions.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApplicationClass {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationClass.class, args);
    }
}

@RestController
class HelloWorldController {

    @GetMapping("/test-hello-world")
    public String testHelloWorld() {
        return "Application is running";
    }
}