package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.name + " " + s.surname + " from " + s.country);
        }
    }

    public String getStudentInfoStrange(Student s) {
        Student myself = new Student("Lasha", "Chubinidze", "Georgia", "info");

        if (s.equals(myself)) {
            if (students.contains(s)) {
                return "კომპიუტერის ორგანიზაცია(ENG), ალგორითმები და მონაცემთა სტრუქტურა(ENG), ობიექტზე ორიენტირებული დაპორგრამება(ENG), კომპიუტერი და საზოგადოება(ENG)";
            } else {
                return "01024076***"; /*last 3 are hidden because this is being uploaded to a public repository */
            }
        } else {
            if (students.contains(s)) {
                return s.info;
            } else {
                return null;
            }
        }
    }
}
