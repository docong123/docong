package Assignment4;

import java.util.ArrayList;


public class donhang {
    ArrayList<Product> ProductList = new ArrayList<>();
    int ID;
    int TongTien;

    donhang(){
        this.ID = (int)(Math.random()*9);
    }
    public  void  AddSanPham(Product Prd){
        if(Prd.getSoLuong()>0)
            ProductList.add(Prd);
        if(Prd.getKhuyenMai()!=0){
            this.TongTien += Prd.getGiaTien() *(100 - Prd.getKhuyenMai()/100);
        } else if (Prd.getKhuyenMai()==0)
            this.TongTien += Prd.getGiaTien();
        else
            System.out.println("Sản phẩm đã hết hàng");
    }

    public  void  printDonHang() {
        for (Product donHang : ProductList ){
            System.out.println(donHang.getTên() +",ID"+ donHang.getID());
            System.out.println("giá "+ donHang.getGiaTien()+ "khuyến mãi"+donHang.getKhuyenMai());
        }
        System.out.println("Tổng tiền "+this.TongTien);
    }

    public static void main(String[] args) {
        donhang dh = new donhang();
        Product sp1 = new Product(5,0);
        Product sp2= new Product(2,20);
        Product sp3 = new Product(0,0);
    }
}

