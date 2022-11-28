package com.example.copsboot.repository;

/**
 * implements UserRepositoryCustom method
 * */
import com.example.copsboot.user.UserId;
import com.example.orm.jpa.UniqueIdGenerator;

import java.util.UUID;

public class UserRepositoryImpl implements UserRepositoryCustom{

    private final UniqueIdGenerator<UUID> generator;


    public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    /**
     * @return
     */
    @Override
    public UserId nextId() {
        return new UserId(generator.getNextUniqueId());
    }
}
