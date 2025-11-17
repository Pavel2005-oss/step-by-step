package work_17_11_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SchoolClass {
    private String name;
    private List<Student> students;   /// новый тип данных студенты Student

    public SchoolClass (String name){
        this.name = name;
        this.students = new ArrayList<>( );
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
