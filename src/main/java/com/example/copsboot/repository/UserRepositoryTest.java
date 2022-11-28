package com.example.copsboot.repository;

import com.example.copsboot.user.User;
import com.example.copsboot.user.UserRole;
import com.example.orm.jpa.InMemoryUniqueIdGenerator;
import com.example.orm.jpa.UniqueIdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class) // to enable testing with support of spring boot
@DataJpaTest // testing on JPA related section
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository; //Inject UserRepository to use it in unit test

    @Test
    public void testStoreUser() { // method containing your test
        HashSet<UserRole> roles = new HashSet<>();
        roles.add(UserRole.OFFICER);
        User user = repository.save(new User(repository.nextId(), "gmfadhili@gmail.com", "my-secret-pwd",roles)); // save the user entity to database

        assertThat(user).isNotNull(); // test if object returned is not a null object
        assertThat(repository.count()).isEqualTo(1L); //if you count the number of entities on the database , they should be one

    }

    //InMemory config for UUID
    @TestConfiguration
    static class TestConfig{
        @Bean
        public UniqueIdGenerator<UUID> generator() {
            return new InMemoryUniqueIdGenerator();
        }

    }


}


