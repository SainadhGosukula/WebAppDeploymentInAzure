package sample.WebAppDeploymentInAzure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebAppDeploymentInAzureApplication {

	@GetMapping("")
public static String hello(){
	return "Hello World, Springboot";
}
	public static void main(String[] args) {
		SpringApplication.run(WebAppDeploymentInAzureApplication.class, args);
		hello();
	}

}
