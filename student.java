package sample;

public class student extends Controller {
    int age;

    public student(int id,int age, String name) {
        super(id, name);
        this.age= age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void toStringg() {
        System.out.println("ID: "+id+ "Age:"+age +"Name: "+name);
    }
}