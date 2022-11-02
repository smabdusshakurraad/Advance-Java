/**
 * Contact class
 * @author Abdus Sakur
 */
public class Contact {
    public enum Gender{
        MALE, FEMALE
    }
    private String name;
    private String email;
    private int age;
    private Gender gender;

    public Contact(String name, String email, int age, Gender gender){
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public Contact(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }
}
