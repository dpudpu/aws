package com.example.aws.model.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void save() {
        User fixture = User.builder().name("test").build();
        User test = userRepository.save(fixture);

        assertThat(test.getCreatedAt()).isNotNull();
        assertThat(test.getId()).isNotNull();
        assertThat(test.getLastModifiedAt()).isNotNull();
    }
}
