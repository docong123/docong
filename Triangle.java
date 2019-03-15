package Assignment3;

public class Triangle {
    public int CanhA;
    public int CanhB;
    public int CanhC;
    public int ChieuDai;
    public int Chieurong;

    public int getCanhA() {
        return CanhA;
    }

    public void setCanhA(int canhA) {
        CanhA = canhA;
    }

    public int getCanhB() {
        return CanhB;
    }

    public void setCanhB(int canhB) {
        CanhB = canhB;
    }

    public int getCanhC() {
        return CanhC;
    }

    public void setCanhC(int canhC) {
        CanhC = canhC;
    }

    public int getChieuDai() {
        return ChieuDai;
    }

    public void setChieuDai(int chieuDai) {
        ChieuDai = chieuDai;
    }

    public int getChieurong() {
        return Chieurong;
    }

    public void setChieurong(int chieurong) {
        Chieurong = chieurong;
    }

    public void CanhTamGiac(){
        System.out.println("Canh a: "+CanhA);
        System.out.println("Canh b: "+CanhB);
        System.out.println("Canh c: "+CanhC);
    }
    public void TypeTriangle(){
        if(this.CanhA !=this.CanhB && this.CanhA !=this.CanhC && this.CanhB != this.CanhC ){
            System.out.println("Đây là Tam giác Thường ");
        } else if(this.CanhA==this.CanhB || this.CanhB==this.CanhC || this.CanhC== this.CanhA){
            System.out.println("Đây là Tam giác Cân");
        } else if(this.CanhA==this.CanhB && this.CanhB==this.CanhC){
            System.out.println("Đây là Tam giác Điều");
        }
    }
    public float ChuViTriangle() {
        int chuvi = this.CanhA +this.CanhB + this.CanhC;
        System.out.println("Chu vi tam giác là: "+ chuvi );
        return chuvi;
    }
    public double DienTichTriangle() {
        double dientich = Math.pow(this.CanhA, 2) * (Math.sqrt(3) / 4);
        System.out.println("Diện Tích Hình Tam giác là: " + dientich);
        return dientich;
    }
    public void RecTangle () {
        System.out.println("Chiều dài hình chữ nhật là: " + this.ChieuDai);
        System.out.println("Chiều rộng hình chữ nhật là: " + this.Chieurong);
    }
    public int ChuViRectangle() {
        int ChuViRec = (this.ChieuDai + this.Chieurong) * 2;
        System.out.println("CHu vi hình chữ nhật là: " + ChuViRec);
        return ChuViRec;
    }
    public int DienTichRectangle() {
        int DienTichRec = this.ChieuDai * this.Chieurong;
        System.out.println("Diện Tích hình chữ nhật là: " + DienTichRec);
        return DienTichRec;
    }

    public static void main(String[] args) {
        Triangle CanhTamGiac = new Triangle();
        Triangle CanhHCN = new Triangle();
        CanhTamGiac.setCanhA(6);
        CanhTamGiac.setCanhB(6);
        CanhTamGiac.setCanhC(6);
        CanhTamGiac.CanhTamGiac();
        CanhTamGiac.TypeTriangle();
        CanhTamGiac.ChuViTriangle();
        CanhTamGiac.DienTichTriangle();
        CanhHCN.setChieuDai(14);
        CanhHCN.setChieurong(19);
        CanhHCN.RecTangle();
        CanhHCN.ChuViRectangle();
        CanhHCN.DienTichRectangle();
    }
}
