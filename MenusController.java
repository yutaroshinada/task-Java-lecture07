package com.example.demo;

import com.example.demo.Form.CreateForm;
import com.example.demo.Form.UpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class MenusController {

    @GetMapping("/menusInfo")
    public List<String> getMenus() {
        return List.of("POP CORN", "DRINK");
    }

    @PostMapping("/menusInfo")
    public ResponseEntity<String> createMenu(@RequestBody CreateForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/menusInfo/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("menu successfully created");
    }

    @PatchMapping("/menusInfo/{id}")
    public ResponseEntity<Map<String, String>> updateMenu(@PathVariable("id") int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "menu successfully updated"));
    }

    @DeleteMapping("/menusInfo/{id}")
    public ResponseEntity<Map<String, String>> deleteMenu(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "menu successfully deleted"));
    }
}
