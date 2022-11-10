import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("your name?");
        String name = scanner.nextLine();

        System.out.println("your surname?");
        String surname = scanner.nextLine();

        System.out.println("your height");
        double height = scanner.nextDouble();

        System.out.println("your age?");
        int age = scanner.nextInt();

        //Person person1 = new Person(name, surname, height, age);
        //System.out.println("dati: " + " " + person1.getName() + " " + person1.getSurname() + " " + person1.getHeight() + " " + person1.getAge());

        System.out.println("dati: " + " " + name + " " + surname + " " + height + " " + age);
    }
}
/**
 * non mi prende i getter e i setter xk?
 */