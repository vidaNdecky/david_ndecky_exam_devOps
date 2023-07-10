package com.groupeisi.m2gl.david_ndecky.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {

    @PostMapping("/api/v1/checkpalindrome")
    public ResponseEntity<Boolean> checkPalindrome(@RequestBody String motAverifier) {
        boolean isPalindrome = isPalindrome(motAverifier);

        return ResponseEntity.status(isPalindrome ? HttpStatus.ACCEPTED : HttpStatus.OK)
                .body(isPalindrome);
    }

    private boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}

