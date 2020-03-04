package damjav.carcoster.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;
    @Email
    @Column(nullable = false)
    private String email;
    @OneToMany
    private List<Car> cars;


}
