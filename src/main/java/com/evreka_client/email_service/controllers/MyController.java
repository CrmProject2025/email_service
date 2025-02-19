package com.evreka_client.email_service.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evreka_client.email_service.dtos.email.EmailSendDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
// @RequestMapping("")
public class MyController {

    // @PostMapping("")
    // public ResponseEntity<ResponseDto> createOrder(
    // @Validated @RequestBody OrderCreateDto orderCreateDto, Authentication auth) {
    // User user = userRepository.findByUsername(auth.getName());
    // orderService.createOrder(orderCreateDto, user);
    // return ResponseEntity.ok(ResponseDto.toDto("Order created by " +
    // user.getEmail()));
    // }

    @GetMapping("/email/{id}")
    public Long getEmailIdTest(@PathVariable("id") Long id) {
        System.out.println("catch something" + id);
        System.out.println("catch something" + id);
        System.out.println("catch something" + id);
        return 123L;

    }

    @PostMapping("/email")
    public void sendToEmail(@Validated @RequestBody EmailSendDto emailSendDto) {
        System.out.println("catch something" + emailSendDto.getEmail());
        System.out.println("catch something" + emailSendDto.getInfo());
        System.out.println("catch something" + emailSendDto.getEmail());

    }
}