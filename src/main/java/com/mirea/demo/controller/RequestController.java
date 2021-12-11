package com.mirea.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
@Api(tags = "Методы контроллера")
@AllArgsConstructor
public class RequestController {

    @PostMapping
    @ApiOperation(value = "Получение post-запроса",
            notes = "Получение post-запроса")
    public ResponseEntity<String> createRequest(@RequestBody String requestString) {
        return ResponseEntity.ok(String.format("Hello %s", requestString));
    }

    @GetMapping("{name}")
    @ApiOperation(value = "Получение get-запроса",
            notes = "Получение данных get-запроса")
    public ResponseEntity<String> getRequest(@ApiParam("Имя пользователя приложения") @PathVariable String name) {
        return ResponseEntity.ok(String.format("Hello %s", name));
    }

}
