package work9;

public class Student {
    public int studentId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }


        Student other = (Student) obj;
        return studentId == other.studentId;
    }
}
