package cn.tedu._03mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BMIController {
    @RequestMapping("BMI")
    @ResponseBody
    public String BMI(Double height, Double weight) {
        double result = weight / (height * height);
        if (result < 18.5) {
            return "瘦";
        }
        if (result < 24) {
            return "正常";
        }
        if (result < 27) {
            return "微胖";
        }

        return "该减肥了";


    }
}
