package enthuware;

public class Student {
    private String name;
    private int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    //constructor and getters and setters not shown
        public void addMarks(int m){
            this.marks += m;
        }
        public void debug() {
            System.out.println(name+":"+marks);
        }
}