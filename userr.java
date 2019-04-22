package JV2_Session6;
import java.sql.*;
import java.util.Scanner;

public class userr {
    static Statement statement;
    static  ResultSet resultSet;

    public static final int ACTIVE = 1;
    public static final int DEACTIVE = 0;

    public static void main(String args[]){
        try {
            Connector connector = new Connector();
            boolean start =  true;
            Scanner scanner = new Scanner(System.in);
            while (start){
                System.out.println("Nhap vao lua chon:");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Listing");
                System.out.println("4. Delete");
                System.out.println("5. Exit");

                int menu = scanner.hasNextInt()?scanner.nextInt():0;
                switch (menu){
                    case 1: login(connector); break;
                    case 2: register(connector);break;
                    case 3: Listing(connector);break;
                    case 4: Delete(connector);break;
                    case 5: start= false;connector.close();break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void login(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap password:");
        String password =  scanner.nextLine();

        String sql = "SELECT * FROM user WHERE password LIKE '"+password
                + "' AND username LIKE '"+username+"'";
        ResultSet rs = connector.getQuery(sql);
        if(rs.next()){
            System.out.println("Dang nhap thanh cong");
            return;
        }
        System.out.println("Sai username hoac password.");
    }

    public static void register(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap password:");
        String password =  scanner.nextLine();

        String sql = "INSERT INTO user(username,email,password,status) VALUES('"+username+"','"+
                email+"','"+password+"',"+ACTIVE+")";
        if(connector.updateQuery(sql)>0){
            System.out.println("Dang ky thanh cong");
            return;
        }
        System.out.println("Chua tao duoc tai khoan");
    }
    public static void Listing(Connector connector) throws Exception {
        String sql = "SELECT * FROM user";
        System.out.println("Danh sách người dùng: ");
        resultSet =connector.getQuery(sql);

        while (resultSet.next()){
            String statuss ="";
            if (resultSet.getInt("status")== 0){
                statuss = "disable";
            }else
                statuss = "enable";
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Username: " + resultSet.getString("username"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("Password: " + resultSet.getString("password"));
                System.out.println("Status: " + statuss);
        }
    }

    public static void Delete(Connector connector){
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id bạn muốn xóa: ");
        id = sc.nextInt();
        System.out.println("bạn muốn xóa khỏi db hãy nhấn phím 1, thay đổi status về 0 nhấn phím 2");

        try {
            int dlt =sc.nextInt();
            switch (dlt){
                case 1:
                    String delete = "DELETE FROM user WHERE id='"+id+"'";
                    connector.updateQuery(delete);
                    System.out.println("Xóa thành công");

                case 2:
                    String edit = "UPDATE user SET status=0 WHERE id= '"+id+"'";
                    connector.updateQuery(edit);
                    System.out.println("thay đổi status thành công !!!!!!!!");
                    break;
                case 3:
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}