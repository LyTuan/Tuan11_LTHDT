package lap8;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 11/10/15
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Clazz {
    private String nameClass;
    private ArrayList<Person>list = new ArrayList<Person>();
    private static Clazz clazz;
    private  Clazz(){

    }
    private  Clazz(String nameClass, ArrayList list){
        this.nameClass=nameClass;
        this.list=list;
    }
    public static Clazz creatClazz(String nameClass, ArrayList list){
        if(clazz!=null){
            return clazz;
        }else {
            return new Clazz(nameClass,list);
        }
    }
    public static  void  main(String args[]){
         String className = "A1";
        ArrayList<Person>list1 = new ArrayList<Person>();
        Clazz.creatClazz(className,list1);
        PersonFactory personFactory = new PersonFactory();
        for(int pos =0; pos<10; pos++){
                   Person person = personFactory.creatPerson("student");
                list1.add(person);

        }
        Person person = personFactory.creatPerson("teacher");
        list1.add(person);
        for(Person person1 : list1){
            person1.work();
        }

    }
}
