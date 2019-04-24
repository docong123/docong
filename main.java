package Lab_Session6;
import jdk.nashorn.internal.objects.annotations.Where;

import java.net.ConnectException;
import java.sql.*;
import java.util.Collections;
import java.util.Scanner;

public class main {
    static boolean stop = false;
    static Statement statement;

    public static void main(String[] args) {
        try {
            //đăng kí drive
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1807m";
            Connection bo = DriverManager.getConnection(URL, "root", "");
            //bước 4: try vấn dữ liệu

            String sql = "SELECT * FROM student ";
            statement = bo.createStatement();
            statement.executeQuery(sql);
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("ID:" + resultSet.getInt("id"));
                System.out.println("Name:" + resultSet.getString("name"));
                System.out.println("Age:" + resultSet.getInt("age"));
                System.out.println("Salary:" + resultSet.getInt("salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int start;
        int id;
        String name;
        int age;
        int salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n mời bạn chọn 1 phương thức");
        System.out.println("1: Edit student");
        System.out.println("2: Delete student");
        start = scanner.nextInt();
        switch (start) {
            case 1:

                System.out.println("id");
                id = scanner.nextInt();
                System.out.println("name");
                name = scanner.nextLine();
                scanner.nextLine();
                System.out.println("age");
                age = scanner.nextInt();
                System.out.println("salary");
                salary = scanner.nextInt();
                String edit_sql = "UPDATE student SET nam='"+name+"',age='"+age+"',salary='"+salary+"' WHERE id='"+id+"'";

                try {
                    statement.executeUpdate(edit_sql);

                } catch (SQLException e) {
                    e.getStackTrace();

                }
                break;
            case 2:
                System.out.println("nhập ID muốn xóa");
                id = scanner.nextInt();
                String delete_sql = "DELETE FROM student WHERE id='"+id+"'";
                try {
                    statement.executeUpdate(delete_sql);
                    System.out.println("đã xóa thành công !!!");
                }catch (Exception e){}
        }


    }
}
