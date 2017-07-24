package name.lizhe.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello(HttpServletRequest req) {
		req.getSession().setAttribute("testKey", "testValue");
        return "helloworld";
    }
}
