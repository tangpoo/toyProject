package com.sparta.todoapp;

import com.sparta.todoapp.repository.UserRepository;
import com.sparta.todoapp.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest
public class SignupTest {

    @Autowired
    UserRepository userRepository;



    @Test
    @DisplayName("회원 가입, 조회 테스트")
    @Transactional
    void test1(){
        User user1 = new User();
        user1.setUsername("Robbie");
        user1.setEmail("Robbie@gmail.com");
        user1.setPassword("1234");

        userRepository.save(user1);

        Assertions.assertThat(user1.getUsername())
                        .isEqualTo(userRepository.findById(user1.getId()).orElseThrow().getUsername());
    }


}
