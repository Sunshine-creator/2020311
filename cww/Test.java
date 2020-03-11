package cww;
public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal("圆圆");
//        animal.eat("玉米");
//        animal = new Bird("蔡徐坤");
//        animal.eat("土");
//        IShape iShape =new Cycle();
//        iShape.draw();
//        Student [] student = new Student[]{
//            new Student("张三",95),
//            new Student("李四",96),
//            new Student("王麻子",97),
//            new Student("张合",92),
//
//        };
//        System.out.println(student);
        Animal1 animal1 = new Animal1();
        Animal1 animal12 = animal1.clone();
        System.out.println(animal1==animal12);
    }
}
