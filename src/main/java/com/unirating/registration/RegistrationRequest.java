package com.unirating.registration;

public record RegistrationRequest(
         String userName,
         String email,
         String password,
         String role) {
}