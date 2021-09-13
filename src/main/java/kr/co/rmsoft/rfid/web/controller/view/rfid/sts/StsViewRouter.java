package kr.co.rmsoft.rfid.web.controller.view.rfid.sts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class StsViewRouter {

    /**
     * 메인 화면
     * @param model
     * @return
     */
    @GetMapping("/rfid/sts/main")
    public String mainView(ModelMap model) {
        return "views/rfid/sts/main";
    }
}
