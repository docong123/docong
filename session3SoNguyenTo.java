package Lab;

public class session3SoNguyenTo {
    int a=2;
    public session3SoNguyenTo(){
    }
    public session3SoNguyenTo(int x){
        if(this.isSoNguyenTo(x)){
            this.a=x;
        }else {
            System.out.println("không phải số nguyên tố");
        }
    }
    public int getA(){
        return this.a;
    }
    public void setA(int a){
        if(this.isSoNguyenTo(a)){
            this.a=a;
        }else {
            System.out.println("không phải số nguyên tố");
        }
    }

    public boolean isSoNguyenTo(int x) {
        if (x<2) return false;
        if (x==2) return true;
        for (int i=2;i<=x/2;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    public int TimSoNguyenToTiepTheo() {
        for (int i=this.a+1;true;i++){
            if (this.isSoNguyenTo(i)) {
                this.a = i;
                break;
            }
        }
        return this.a;
    }

    public static void main(String[] args) {
        session3SoNguyenTo a = new session3SoNguyenTo(4);

        for (int i=0;i <30;i++){
            System.out.println("SNT: " +a.TimSoNguyenToTiepTheo());
        }
    }
}
