package com.fixmystreet.fixmystreet.dtos.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateUserDTO(

        @NotBlank(message = "Name is required")
        String name,

        @Email(message = "Email is not valid")
        String email,

        @NotBlank(message = "Password is required")
        String password,
        String profileImage
) {
}
