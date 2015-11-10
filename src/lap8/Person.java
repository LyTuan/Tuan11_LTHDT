package lap8;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 11/10/15
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
       private String name;
        private String className;
    private Date date;
   public  Person(){

   }
    public Person(String name, String className, Date date){
        this.name = name;
        this.className = className;
        this.date = date;

    }
    public void setName(String name){
        this.name = name;
    }
    public  void setClassName(String className){
        this.className = className;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public String getClassName(){
        return className;
    }
    public Date getDate(){
        return date;
    }
    public void work(){

    }
}
