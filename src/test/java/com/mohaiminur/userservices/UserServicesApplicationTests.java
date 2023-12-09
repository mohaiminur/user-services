package com.mohaiminur.userservices;

import com.mohaiminur.userservices.entity.User;
import com.mohaiminur.userservices.repository.UserRepository;
import com.mohaiminur.userservices.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
class UserServicesApplicationTests {

    @Test
    void contextLoads() {
    }


}
