package com.example.demo.Controller;

import com.example.demo.Form.CreateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@RestController
public class MenusPostController {

    @PostMapping("/menus")
    public ResponseEntity<Map<String, String>> createMenu(@RequestBody @Validated CreateForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/menus/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("Message","menus successfully created"));
    }
}
