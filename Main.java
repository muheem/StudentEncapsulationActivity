public class Main {
    public static void main(String[] args) {
        MathsStudent student = new MathsStudent("Ashik Malik", 'C', 4);
        try {
            MathsStudent student2 = new MathsStudent("Ashik Malik", 'C', 7);
        } catch (Exception e) {
            System.out.println("Invalid Group value entered for student.");
        }
        student.upgrade();
        System.out.println("Grade = " + student.getGrade());

        student.downgrade();
        student.downgrade();
        System.out.println("Grade = " + student.getGrade());
    }
}

