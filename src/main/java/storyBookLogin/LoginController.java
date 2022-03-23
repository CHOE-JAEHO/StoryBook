package storyBookLogin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/login")
public class LoginController {

	
	@RequestMapping(value="/login.book")
	public String loginView() throws Exception {
	
		return "login/login";
	}
	
}
