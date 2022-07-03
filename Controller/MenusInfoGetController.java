package com.example.demo.Controller;

import com.example.demo.MenusInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenusInfoGetController {

    @GetMapping("/menusInfo")
    public List<MenusInfo> getMenusInfo(@RequestParam(name = "menusInfo",value = "menusInfo", required = true) String menusInfo) {
            return List.of(
                   new MenusInfo("POP CORN", 380),
                    new MenusInfo("DRINK", 380));
        }

}
