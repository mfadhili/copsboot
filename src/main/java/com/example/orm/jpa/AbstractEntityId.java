package com.example.orm.jpa;

/**
* AbstractEntityId class for basis of all Id classes
* For creating a dedicated Primary key clas
* */

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;

@MappedSuperclass
public abstract class AbstractEntityId<T extends Serializable> implements Serializable, EntityId<T> {
    
    private T id;

    // Empty constructor
    @ArtifactForFramework
    protected AbstractEntityId() {
    }

    public AbstractEntityId(T id) {
        this.id = Objects.requireNonNull(id);
    }

    /**
     * @return 
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @param obj 
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if(this == obj) {
            result = true;
        } else if (obj instanceof AbstractEntityId){
            AbstractEntityId other = (AbstractEntityId) obj;
            result = Objects.equals(id, other.id);
        }

        return result;
    }

    /**
     * @return 
     */
    @Override
    public String toString() {
        return toStringHelper(this).add("id ", id).toString();
    }

    /**
     * @return 
     */
    @Override
    public T getId() {
        return null;
    }

    /**
     * @return 
     */
    @Override
    public String asString() {
        return null;
    }
}
