package app;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int resultOfComparing = student1.getFirstName().compareTo(student2.getFirstName());
        if (resultOfComparing != 0) return resultOfComparing;

        resultOfComparing = student1.getLastName().compareTo(student2.getLastName());
        if (resultOfComparing != 0) return resultOfComparing;

        resultOfComparing = student1.getMiddleName().compareTo(student2.getMiddleName());
        if (resultOfComparing != 0) return resultOfComparing;
        return 0;
    }
}
