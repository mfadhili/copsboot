package com.example.orm.jpa;

/**
* Interface for entity objects.
* @param<T> the type of {@link EntityId} that will be used for this entity
* */

public interface Entity <T extends EntityId>{

    T getId();
}
