package com.example.demo.Controller;

import com.example.demo.Form.UpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MenusInfoPatchController {

    @PatchMapping("/menusInfo/{id}")
    public ResponseEntity<Map<String, String>> updateMenu(@PathVariable("id") int id, @Validated @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "menusInfo successfully updated"));
    }
}
