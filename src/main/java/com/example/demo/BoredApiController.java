package com.example.demo;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BoredApiController {

    @GetMapping("/bored")
	public BoredApiModel getBoredApiModel(RestTemplate restTemplate) {

        Time time = new Time(00, 20, 30);

        String url = "http://www.boredapi.com/api/activity?";
    List<String> types = time.acessTime();

    for (String type : types) {
        url += type;
    }
        BoredApiModel BoredApiModel = restTemplate.getForObject(url, BoredApiModel.class);  
		return BoredApiModel;
    }
}