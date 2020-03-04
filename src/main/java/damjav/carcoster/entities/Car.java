package damjav.carcoster.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;
    private Integer year;
    private Integer milage;


}
