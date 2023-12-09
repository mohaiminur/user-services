package com.mohaiminur.userservices.entity;

        import com.mohaiminur.userservices.enums.UserType;
        import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_types")
@Data
@AllArgsConstructor@NoArgsConstructor
public class UserTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserType userType;


}