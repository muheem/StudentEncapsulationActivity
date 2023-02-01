public class MathsStudent {
    private String name;
    private char grade;
    private int group;
    private String secretNickName = "MySecretNickName";
    private static char MAX_GRADE = 'A';
    private static char MIN_GRADE = 'F';

    private static int MAX_GROUP_VALUE = 5;
    private static int MIN_GROUP_VALUE = 1;

    public MathsStudent(String name, char grade, int group) {
        GroupValueCheck(group);
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    void GroupValueCheck(int group) {
        if ((group < MIN_GROUP_VALUE) || (group > MAX_GROUP_VALUE) )
            throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }
    public char getGrade(){
        return grade;
    }
    public void upgrade() {
        if (grade != MAX_GRADE)
            grade--;
    }
    public void downgrade() {
        if (grade != MIN_GRADE)
            grade++;
    }
    public int getGroup() {
        return group;
    }

}
