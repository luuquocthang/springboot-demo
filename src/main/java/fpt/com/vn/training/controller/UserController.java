package fpt.com.vn.training.controller;

import fpt.com.vn.training.dtos.UserDto;
import fpt.com.vn.training.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Controller
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

//    @GetMapping("/users")
////    @PreAuthorize("hasRole('ADMIN')")
//    public ResponseEntity<?> findAll(Pageable pageable) {
//
//        Page<UserDto> jsonBody
//
//        return ResponseEntity.ok(jsonBody);
//    }
}
