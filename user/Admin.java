package user;
import book.*;
import java.util.Scanner;
public class Admin extends  User {
    public Admin(String name) {
        this.name = name;
        this.actions = new IAction[]{
                new Exit(),
                new Delete(),
                new Find(),
                new Display(),
                new Add(),
        };
    }
        @Override
        public int menu () {
            System.out.println("*****************");
            System.out.println("欢迎"+this.name+"使用图书管理系统，您是管理员");
            System.out.println("1.查找");
            System.out.println("2.删除");
            System.out.println("3.增加");
            System.out.println("4.展示");
            System.out.println("0.退出");
            System.out.println("*****************");
            System.out.println("请输入您的选择：");
            Scanner scanner = new Scanner(System.in);
            int choice =0;
            choice = scanner.nextInt();
            return choice;
        }
    }
