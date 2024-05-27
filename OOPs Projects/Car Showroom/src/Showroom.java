import java.sql.SQLOutput;
import java.util.Scanner;
public class Showroom implements utility{
    String Showroom_name;
    String Showroom_Address;
    String Manager_Name;
    int total_cars_in_stock = 0;
    int total_employees;
    public void getDetails() {
        System.out.println("Showroom Name: "+Showroom_name);
        System.out.println("Showroom Address: "+Showroom_Address);
        System.out.println("Manager Name: "+Manager_Name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stock: "+total_cars_in_stock);
    }
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        Showroom_name = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        Showroom_Address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        Manager_Name = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        total_employees = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_cars_in_stock = sc.nextInt();
    }
}
