package user;
import book.*;
import java.util.Scanner;
public class normalUser extends  User {
    public normalUser(String name) {
        this.name =name;
        this.actions = new IAction[]{
                new Exit(),
                new Find(),
                new Brrow(),
                new Retern(),
        };
    }
    @Override
    public int menu() {
        System.out.println("********************");
        System.out.println("欢迎" + this.name+"使用系统");
        System.out.println("1.查找图书");
        System.out.println("2.借书");
        System.out.println("3.还书");
        System.out.println("0.退出");
        System.out.println("********************");
        System.out.println("请输入您的选择：");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        return choice;
//      System.out.println("=======================");
    }
}
