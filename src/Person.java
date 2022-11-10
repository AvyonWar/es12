import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;
@Data

public class Person {
    @Getter
    @Setter
    private String name;
    private String surname;
    private double height;
    private int age;
    public Person(String name, String surname, double height, int age){
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.age = age;
    }


}
