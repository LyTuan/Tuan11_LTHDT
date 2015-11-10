package lap8;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 11/10/15
 * Time: 4:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonFactory {

    public Person creatPerson(String kindPerson){
                 if(kindPerson==null){
                     return null;
                 }else if(kindPerson.equalsIgnoreCase("Teacher")){
                     return new Teacher();
                 }else if(kindPerson.equalsIgnoreCase("student")){
                     return new Student();
                 }

                 return null;

    }

}
