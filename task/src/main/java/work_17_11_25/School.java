package work_17_11_25;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<SchoolClass> classes;

    private School(String name) {
        this.name = name;

        this.classes = new ArrayList<>();

    }
    public void addClass (SchoolClass schoolClass){
        this.classes.add(schoolClass);
    }


    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }
}
