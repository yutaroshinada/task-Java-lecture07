package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MenusInfoDeleteController {

    @DeleteMapping("/menus/{id}")
    public ResponseEntity<Map<String, String>> deleteMenu(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "menusInfo successfully deleted"));
    }
}
