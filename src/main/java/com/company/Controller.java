package com.company;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class Controller {
    private  final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody   Dto dto){
        UserEntity date = userService.create(dto);
        return ResponseEntity.ok().body(date);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
       UserEntity  entity = userService.get(id);
        return ResponseEntity.ok().body(entity);
    }

}
