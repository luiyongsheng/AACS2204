class Course {
    private String courseTitle;
    public String getCourseTitle() {
        return this.courseTitle;
    }
    public void setCourseTitle(String val) {
        this.courseTitle = val;
    }

    private double feesPerStudent;
    public double getFeesPerStudent() {
        return this.feesPerStudent;
    }
    public void setFeesPerStudent(double val) {
        this.feesPerStudent = val;
    }

    private int noOfStudents;
    public int getNoOfStudents() {
        return this.noOfStudents;
    }

    private String[] studentNames;

    private int courseCount;
    public int getCourseCount() {
        return this.courseCount;
    }

    Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        this.studentNames = new String[100];
    }
    
    public double calcFeesCollected() {
        return this.feesPerStudent * this.noOfStudents;
    }

    public void addStudent(String studName) {
        if(this.noOfStudents == 100) return;
        else {
            this.studentNames[this.noOfStudents] = studName;
        }
    }
    public String toString() {
        return "Course Title : " + this.courseTitle + "\nFee Per Student : " + this.feesPerStudent + 
               "\nNo of Student : " + this.noOfStudents; 
    }
}


public class P4Q4 {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Computers", 250);
        System.out.format("Course Title     : %s\n", course.getCourseTitle());
        System.out.format("Fees per student : RM %.2f\n", course.getFeesPerStudent());

    }
}
