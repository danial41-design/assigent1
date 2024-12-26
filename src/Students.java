import java.util.ArrayList;

public class Students extends Person {
    int StudentId;
    private static int studentIdgen=1;

    ArrayList<Integer> grades = new ArrayList<>();
    float gpa;

    public Students() {
        super();
        this.StudentId = studentIdgen++;
    }
    public Students(String name, String surname, int age, boolean gender, ArrayList<Integer> grades, float gpa) {
        super(name, surname, age, gender);
        this.grades = grades;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void addGrade(int grade) {
        grades.add(grade);
        calculateGpa();
    }

    public int getstudentId() {
        return StudentId;
    }

    private void calculateGpa() {
        float intsum = 0;

        for(Integer grade:grades) {
            intsum += grade;
        }
        gpa = intsum / grades.size();
    }
    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "I'm student with id " + StudentId;
    }
}
