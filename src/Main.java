public class Main {
    public static void main(String[] args) {
        MathsStudent student = new MathsStudent("Ashik Malik", 'C', 4);
        try {
            MathsStudent student2 = new MathsStudent("Ashik Malik", 'C', 7);
        } catch (Exception e) {
            System.out.println("Invalid Group value entered for student.");
        }

        System.out.println( student.getName());
        student.upgrade();
        System.out.println("Grade = " + student.getGrade());

        student.downgrade();
        student.downgrade();
        System.out.println("Grade = " + student.getGrade());

        // Check lowest grade is F
        student.downgrade();
        student.downgrade(); // reashed F and downgrading again...
        student.downgrade();
        System.out.println("Grade = " + student.getGrade());

        // Check highest grade is A
        student.upgrade();
        student.upgrade();
        student.upgrade();
        student.upgrade();
        student.upgrade(); //reached A and upgrading again...
        student.upgrade();
        System.out.println("Grade = " + student.getGrade());
    }
}

