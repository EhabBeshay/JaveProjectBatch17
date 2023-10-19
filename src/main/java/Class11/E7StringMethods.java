package Class11;
//https://regexr.com/
public class E7StringMethods {
    public static void main(String[] args) {
        String str = "ksdn   fjAZSXks   d2329   84!@#%^&AS";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("[A-z]","=="));
        System.out.println(str.replaceAll("[A-Z0-9]","="));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        System.out.println(str.replaceAll("[ks2S]","="));
        System.out.println(str.replaceAll("\\d",""));//remove digits
        System.out.println(str.replaceAll("\\s",""));//remove spaces
        System.out.println(str.replaceAll("\\w",""));//remove words
        System.out.println(str.replaceAll("[^A-Z]",""));//remove everything except the mentions char "^"
    }


}
