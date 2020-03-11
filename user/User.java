package user;

import book.BookList;
import book.IAction;

abstract public class User{
     protected  String name;
     protected  IAction [] actions; //表示用户所具有的动作权限
     abstract  public  int menu();
     public  void doAction(int choice, BookList bookList){
         actions[choice].work(bookList);
     }

}
