package staff;

public class EmployeeTest {
    public static void main(String[] args) {
      Employee walterWinkelmann=new Employee("Walter Winkelmann");
      Superior waltraudWichtig=new Superior("WaltraudWichtig");
       Superior hermannWichtiger =new Superior("HermannWichtiger");
      System.out.println( walterWinkelmann.mayOrder(21));

        System.out.println( walterWinkelmann.ist_was("Walter Winkelmann"));
        System.out.println( walterWinkelmann.getInfo());
    }
}
