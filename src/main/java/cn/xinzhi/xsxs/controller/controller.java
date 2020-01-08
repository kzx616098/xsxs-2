package cn.xinzhi.xsxs.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class controller {
    @RequestMapping("/test")
    public String testLog() {
        log.info("日志开始打印");
        System.out.println("输出");
        return null;
    }
}
