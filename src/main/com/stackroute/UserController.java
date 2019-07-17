package main.com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{

  @RequestMapping("/")
  public String view(Model model)
  {
    User user = new User();
    user.setUserName("sowmya");
    String name= user.getUserName();
    model.addAttribute("result",name);
    return "index";

  }
}
