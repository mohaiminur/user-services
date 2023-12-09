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

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllUsers() {
        List<User> userList = new ArrayList<>();

        when(userRepository.getAllUsers()).thenReturn(userList);

        List<User> result = userService.getAllUsers();

        assertEquals(userList.size(), result.size());
    }

    @Test
    void getUserById() {
        Long userId = 1L;
        User sampleUser = new User(userId, "John", "Doe", "Street", "City", "State", "12345", "Parent", null);

        when(userRepository.getUserById(userId)).thenReturn(sampleUser);

        User result = userService.getUserById(userId);

        assertEquals(sampleUser.getId(), result.getId());
        assertEquals(sampleUser.getFirstName(), result.getFirstName());
    }

    @Test
    void createUser() {
        User newUser = new User(null, "Alice", "Smith", "Street", "City", "State", "56789", "Child", 1L);

        userService.createUser(newUser);

        verify(userRepository, times(1)).createUser(newUser);
    }

    @Test
    void updateUser() {
        Long userId = 1L;
        User updatedUser = new User(userId, "UpdatedFirstName", "UpdatedLastName", "UpdatedStreet", "UpdatedCity", "UpdatedState", "UpdatedZip", "Parent", null);

        userService.updateUser(updatedUser);

        verify(userRepository, times(1)).updateUser(updatedUser);
    }

    @Test
    void deleteUser() {
        Long userId = 1L;

        userService.deleteUser(userId);

        verify(userRepository, times(1)).deleteUser(userId);
    }

}
