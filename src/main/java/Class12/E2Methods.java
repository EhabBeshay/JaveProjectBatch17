package Class12;

public class E2Methods {

    int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    int multiply(int num1) {
        int result = num1 * 10;
        return result;
    }

    int largerNumb(int num1, int num2) {
        int result = 0;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;

        }


        return result;
    }
    String createEmail(String firstName, String lastName, String emailType ){

        String email = firstName+lastName+"@"+emailType+".com";
        return email;
    }



}