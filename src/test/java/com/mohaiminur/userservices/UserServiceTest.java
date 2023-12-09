package com.mohaiminur.userservices;

import com.mohaiminur.userservices.entity.User;
import com.mohaiminur.userservices.repository.UserRepository;
import com.mohaiminur.userservices.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceTest {

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
        // Add sample users to the list

        when(userRepository.findAll()).thenReturn(userList);

        List<User> result = userService.getAllUsers();

        assertEquals(userList.size(), result.size());
        // Add more assertions based on your requirements
    }

    @Test
    void getUserById() {
        Long userId = 1L;
        User sampleUser = new User(userId, "John", "Doe", "PARENT", 1L, null);

        when(userRepository.findById(userId)).thenReturn(Optional.of(sampleUser));

        User result = userService.getUserById(userId);

        assertEquals(sampleUser.getId(), result.getId());
        assertEquals(sampleUser.getFirstName(), result.getFirstName());
        // Add more assertions based on your requirements
    }

    @Test
    void createUser() {
        User newUser = new User(null, "Alice", "Smith", "CHILD", 1L, null);

        userService.createUser(newUser);

        // Verify that the repository's save method was called with the correct argument
        verify(userRepository, times(1)).save(newUser);
    }

    @Test
    void updateUser() {
        Long userId = 1L;
        User updatedUser = new User(userId, "UpdatedFirstName", "UpdatedLastName", "PARENT", 1L, null);

        userService.updateUser(updatedUser);

        // Verify that the repository's save method was called with the correct argument
        verify(userRepository, times(1)).save(updatedUser);
    }

    @Test
    void deleteUser() {
        Long userId = 1L;

        userService.deleteUser(userId);

        // Verify that the repository's deleteById method was called with the correct argument
        verify(userRepository, times(1)).deleteById(userId);
    }
}
