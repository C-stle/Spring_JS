package kr.co.rmsoft.web.controller.view.rfid.sts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StsViewRouter {

    @GetMapping("/rfid/sts/main")
    public String mainView(ModelMap model) {
        return "views/rfid/sts/main";
    }
}
