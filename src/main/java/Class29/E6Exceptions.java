package Class29;

public class E6Exceptions {
    public static void main(String[] args) {
  try {
      // we place code that might through an exception
      int[] arr = new int [-5];

  }catch (ArithmeticException e){
      System.out.println("Don't divide by Zero");

  }
  catch (NullPointerException e){
      System.out.println("Check if you stored the null value in the variable");
  }
  catch (Exception e){
      System.out.println("Something went wrong contact Pratyuch");
  }
    }

}
