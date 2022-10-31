package fpt.com.vn.training.controllers;

import javax.validation.Valid;

import fpt.com.vn.training.dtos.UserDto;
import fpt.com.vn.training.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> findAll(Boolean active, Pageable pageable) {
        Page<UserDto> jsonBody = userService.findAll(active, pageable);
        return ResponseEntity.ok(jsonBody);
    }

    @PostMapping ("/user/create")
    public ResponseEntity<?> create(@RequestBody UserDto userDto) {
        try {
            return ResponseEntity.ok(userService.createUser(userDto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PostMapping ("/user/:id?abc=123")
    public ResponseEntity<?> update(@RequestBody UserDto userDto) {
        try {
            return ResponseEntity.ok(userService.createUser(userDto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
