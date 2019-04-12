package sample;

import java.util.ArrayList;

public class PersonModel<E> {
    ArrayList<Controller> List= new ArrayList<>();
    public  void add(Controller e){
        List.add(e);
    }
    public  void input(){
        for(Controller item: List){
            item.toStringg();
        }
    }
}
