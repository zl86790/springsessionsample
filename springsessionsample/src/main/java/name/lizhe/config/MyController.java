package name.lizhe.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(HttpServletRequest req) {
		if (req.getSession().getAttribute("testKey") != null) {
			System.out.println(req.getSession().getAttribute("testKey").toString());
		} else {
			System.out.println("empty");
		}
		req.getSession().setAttribute("testKey", "testValue");
		return "helloworld";
	}
}
