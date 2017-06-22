class Student {
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String v) {
        this.name = v;
    }


    private String studentID;
    public String getStudentID() {
        return this.studentID;
    }
    public void setStudentID(String v) {
        this.studentID = v;
    }


    private int noQuiz;
    public int getNoQuiz() {
        return this.noQuiz;
    }

    private int totalScore;
    public int getTotalScore() {
        return this.totalScore;
    }
    public double getAverageScore() {
        return (double)this.totalScore / this.noQuiz;
    }

    public void addQuiz(int score) {
        this.totalScore += score;
        this.noQuiz++;
    }

    Student() {
        this.studentID = "";
        this.name = "";
        this.noQuiz = 0;
        this.totalScore = 0;
    }
    Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.noQuiz = 0;
        this.totalScore = 0;
    }
}
public class P4Q2 {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Lui");
        std.setStudentID("16WMD0330");
        for(int i = 0; i <3; i++) {
            int score = 1 + (int)(Math.random()*10);
            std.addQuiz(score);
            System.out.println(score);
        }
        System.out.format("%s [%s] has \n", std.getName(), std.getStudentID());
        System.out.format("Total score : %d\n", std.getTotalScore());
        System.out.format("Average score : %.2f\n", std.getAverageScore());
    }
}