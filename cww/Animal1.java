package cww;

public class Animal1 implements  Cloneable {
    private  String name;

    public Animal1(String name) {
        this.name = name;
    }

    @Override
     public  Animal1 clone(){
        Animal1 o =null;
        try{
            o =(Animal1)super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return o;
    }


}
