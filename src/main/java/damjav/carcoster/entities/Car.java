package damjav.carcoster.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;
    private Integer year;
    private Integer mileage;
    @ManyToOne
    private User user;



}
