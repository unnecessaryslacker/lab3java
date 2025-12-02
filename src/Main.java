import java.util.Arrays;
import java.util.Comparator;

/**
 * Виконавчий клас лабораторної роботи №3.
 * Створює масив студентів, сортує його за різними полями
 * та виконує пошук ідентичного об’єкта.
 */
public class Main {

    public static void main(String[] args) {

        // Створення масиву об'єктів Student
        Student[] students = {
                new Student("Андрій", 19, 88.5, "ІО-35", 2),
                new Student("Марія", 20, 91.2, "ІО-34", 3),
                new Student("Олег", 18, 76.4, "ІО-31", 1),
                new Student("Ірина", 21, 84.9, "ІО-35", 3),
                new Student("Сергій", 19, 95.1, "ІО-33", 2)
        };

        System.out.println("\n=== Початковий масив ===");
        Arrays.stream(students).forEach(System.out::println);

        // Сортування за віком — зростання
        Arrays.sort(students, Comparator.comparingInt(Student::getAge));

        System.out.println("\n=== Сортування за віком (зростання) ===");
        Arrays.stream(students).forEach(System.out::println);

        // Сортування за середнім балом — спадання
        Arrays.sort(students, Comparator.comparingDouble(Student::getGpa).reversed());

        System.out.println("\n=== Сортування за середнім балом (спадання) ===");
        Arrays.stream(students).forEach(System.out::println);

        // Пошук ідентичного об'єкта
        Student example = new Student("Марія", 20, 91.2, "ІО-34", 3);

        boolean found = false;
        for (Student s : students) {
            if (s.equals(example)) {
                found = true;
                System.out.println("\nЗнайдено ідентичного студента:");
                System.out.println(s);
                break;
            }
        }

        if (!found) {
            System.out.println("\nІдентичного студента не знайдено.");
        }
    }
}
