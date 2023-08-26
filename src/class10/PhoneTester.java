package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "Samsung";
        phone.pixel = 1000;
        phone.system = "Android";
        System.out.println(phone.system);
        System.out.println(phone.pixel);
        phone.text();
        phone.screenshoot();


        Phone iphone =new Phone();

        iphone.pixel = 2000;
        iphone.brand = "Iphone";
        iphone.system = "IOS";
        iphone.text();
        iphone.screenshoot();


    }

}
