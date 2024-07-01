package likelion.jpasession.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RaviController {

    @GetMapping("Ravi")
    public String Ravi(Model model){
        model.addAttribute("data","My NickName is Ravi");

        return "Ravi";



    }
}
