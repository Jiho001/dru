package jihodev.dru;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestRun {

    @RequestMapping("/")
    public String testRun() {
        return "todo";
    }

    @RequestMapping("/todo")
    public String todo() {
        return "todo";
    }
}
