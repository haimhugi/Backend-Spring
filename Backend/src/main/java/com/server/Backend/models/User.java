package com.server.Backend.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@Document(collection = "users")
public class User {

    @NotEmpty
    @Size(min = 2, max = 20, message = "not a good fit")
    private String Name;

    @NotEmpty
    @Size(min=5,max=30,message = "not a good fit")
    private String Email;

    @NotEmpty
    private String ID;

    @NotEmpty
    @Size(min = 9, max = 10, message = "not a good fit")
    private String Phone;

    @NotEmpty
    @Size(min=6,max=20,message = "not a good fit")
    private String IP;

//    @Id
//    private String id;

    @Id
    private String id;
}
