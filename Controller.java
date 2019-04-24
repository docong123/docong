package JV2_Assignment1;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txt;
    public Button btn;
    public TextArea print;
    Integer a;

    public boolean isPrimeNumber(int x){
        int count = 0;
        for (int i = 1;i<=x; i++){
            if (x%i == 0){
                count++;
            }
        }
        if (count ==2){
            return true;
        }else {
            return false;
        }
    }

    public void submid(){
        String text = "Nhập 1 số lớn hơn 1 ";
        if (txt.getText().isEmpty()){
            print.setText(text);
            return;
        }else {
            String str= "";
            String input = txt.getText().trim();
            try {
                a = Integer.parseInt(input);
            }catch (NumberFormatException e){
                txt.setText("Chỉ nhập vào 1 số không được nhập kí tự ");
                return;
            }
            for (int i=2;i<a;i++){
                if (this.isPrimeNumber(i)){
                    str+=i+ "";
                }
            }
            print.setText(str);
        }
    }
}
