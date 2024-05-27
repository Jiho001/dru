package jihodev.dru;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRun {

    @RequestMapping("/")
    public String testRun() {
        return "main";
    }

    @RequestMapping("/schedule")
    public String testRun2() {
        return "Calender";
    }
    @RequestMapping("/claude")
    public String testRun1() {
        return "claude";
    }


}
