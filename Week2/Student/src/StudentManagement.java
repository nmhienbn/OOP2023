public class StudentManagement {
    private Student[] students = new Student[100];
    private int cntStudents = 0;

    /**
     * Compare 2 students' group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Add a student.
     */
    public void addStudent(Student newStudent) {
        students[cntStudents] = new Student(newStudent);
        cntStudents++;
    }

    /**
     * Group students by group.
     */
    public String studentsByGroup() {
        StringBuilder res = new StringBuilder();
        boolean[] printed = new boolean[cntStudents];
        for (int i = 0; i < cntStudents; i++) {
            if (!printed[i]) {
                res.append(students[i].getGroup());
                res.append("\n");
                res.append(students[i].getInfo());
                res.append("\n");
                for (int j = i + 1; j < cntStudents; j++) {
                    if (sameGroup(students[i], students[j])) {
                        res.append(students[j].getInfo());
                        res.append("\n");
                        printed[j] = true;
                    }
                }
            }
        }
        return res.toString();
    }

    /**
     * Remove Student.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < cntStudents; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i + 1; j < cntStudents; j++) {
                    students[j - 1] = students[j];
                }
                cntStudents--;
                return;
            }
        }
    }
}
