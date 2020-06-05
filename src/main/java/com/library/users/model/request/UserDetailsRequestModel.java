package com.library.users.model.request;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserDetailsRequestModel {

    @NotNull
    @Size(min =2)
    private String firstName;

    @NotNull
    @NotBlank
    private String lastName;

    @NotNull(message = "email cannot be null")
    @Email
    private String email;

    @NotNull(message = "password cannot be null")
    @Size(min=8, max=16)
    private String password;


    @Size(min = 2)
    private String address;

    @Pattern(regexp="[\\d]{5}", message="Must be 5 digits !")
    private String postalCode;

    @Size(min = 2)
    private String city;
}
