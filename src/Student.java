/**
 * Клас Student описує інформацію про студента.
 * Містить мінімум 5 полів згідно з умовою лабораторної роботи №3.
 */
public class Student {

    private String name;
    private int age;
    private double gpa;
    private String group;
    private int course;

    public Student(String name, int age, double gpa, String group, int course) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.group = group;
        this.course = course;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", group='" + group + '\'' +
                ", course=" + course +
                '}';
    }

    /**
     * Два студенти вважаються ідентичними,
     * якщо збігаються всі їхні поля.
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;

        return name.equals(s.name)
                && age == s.age
                && Double.compare(gpa, s.gpa) == 0
                && group.equals(s.group)
                && course == s.course;
    }
}
