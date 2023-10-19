package class10;

public class T1StringDemo {
    public static void main(String[] args) {
        String userName = "Ehab";
        String passWrod = "Staycalm";
        String confirmPassword = "Staycalm";

        if (userName.isEmpty() || passWrod.isEmpty()){
            System.out.println("Username or Password cannot be empty");

                    }else if (passWrod.length()<8){
            System.out.println("Password is too short");

                }else if (passWrod.contains(userName)){
            System.out.println("Password cannot contain username");

            }if (!passWrod.equalsIgnoreCase(confirmPassword)){
            System.out.println("Password do not match");
        }else {
            System.out.println("Your user name and password had been created");
        }






    }
}
