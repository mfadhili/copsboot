package com.example.copsboot.user;

/**
* Before refactoring the User class this UserId class was created
* a Super class to called in the refactoring
* */

import com.example.orm.jpa.AbstractEntityId;

import java.util.UUID;

public class UserId extends AbstractEntityId<UUID> {

    //Hibernate needs the protected no-args constructor to work
    protected UserId() {
    }

    // The constructor that the application code will use
    public UserId(UUID id) {
        super(id);
    }
}
