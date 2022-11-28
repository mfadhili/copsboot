package com.example.copsboot.repository;

/**
 * interface for adding UserId to UserRepository
 * Added to the extends list in the UserRepository
 * */
import com.example.copsboot.user.UserId;

public interface UserRepositoryCustom {
    UserId nextId(); //returns a new User Id each time it is called
}
