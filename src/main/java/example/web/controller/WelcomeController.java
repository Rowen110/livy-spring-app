

package example.web.controller;

import java.util.Date;
import java.util.Map;

import example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello Worldddd";

	@Autowired
	private ExampleService exampleService;


	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping(value = "/foo", method = RequestMethod.GET)
	public String foo() {

		return "foo";
	}

	@RequestMapping(value = "/kdensity", method = RequestMethod.GET)
	public String kerneldensity() {

		return "kdensity";
	}

	@RequestMapping(value = "/correlation", method = RequestMethod.GET)
	public String correlation() {
		return "correlation";
	}

	@RequestMapping(value = "/kdensity/function", method = RequestMethod.GET)
	public String kernelDensityResult(@RequestParam Map<String,String> paramsMap) {
		System.out.println("Inside kernelDensity result");
		String column = paramsMap.get("column");
		exampleService.process(column);
		return "kdensityresult";
	}

	@RequestMapping(value = "/correlation/function", method = RequestMethod.GET)
	public String correlationResult(@RequestParam Map<String,String> allRequestParams) {

		return "correlationresult";
	}

}
