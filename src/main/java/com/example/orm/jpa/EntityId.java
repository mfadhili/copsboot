package com.example.orm.jpa;

import java.io.Serializable;

/**
* Interface implementation for Primary keys of entities.
*
* @param<T> the underlying type of entity id
* */
public interface EntityId<T> extends Serializable {
    T getId();

    String asString(); //returns the ID string representation eg for URL example
}
