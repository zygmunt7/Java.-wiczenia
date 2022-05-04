package phone;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.phoneParameters();
        Phone phone2 = new Phone(6, "iPhone");
        phone2.phoneParameters();
        Phone phone3 = new Phone("Pink", 12, "POCO");
        phone3.phoneParameters();
       PhoneArray phoneArray=new PhoneArray();
       phoneArray.phoneArray();


    }
}
