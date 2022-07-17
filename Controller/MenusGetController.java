package com.example.demo.Controller;

import com.example.demo.Menus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenusGetController {

    @GetMapping("/menus")
    public List<Menus> getMenus(@RequestParam(name = "menus",value = "menus", required = true) String menus) {
            return List.of(
                   new Menus("POP CORN", 380),
                    new Menus("DRINK", 380));
        }

}
