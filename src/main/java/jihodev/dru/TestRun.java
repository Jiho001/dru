package jihodev.dru;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRun {

    @RequestMapping("/")
    public String testRun() {
        return "main";
    }
}
