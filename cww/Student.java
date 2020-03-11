package cww;

public class Student implements Comparable {
    private  String name;
    private  int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "["+this.name + ":"+ this.score +"]";
    }
    @Override
    public int compareTo(Object o) {
        Student student = (Student)o;
        if(this.score >student.score){
            return  -1;
        }else if (this.score < student.score){
            return  1;
        }else{
            return  0;
        }
    }
}
