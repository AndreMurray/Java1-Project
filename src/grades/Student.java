package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String rick, int...grades) {
        this.name = rick;
        this.grades = new ArrayList<>();
        for (int grade : grades) {
            this.grades.add(grade);
        }
    }

    public Student(String rick) {
        this.name = rick;
    }


    // returns the student's name
    public String getName() {
        return this.name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }

        if (this.grades.size() > 0) {
            return (double) sum / this.grades.size();
        } else {
            return 0;
        }
    }

}
