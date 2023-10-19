package Class15;

public class Students {
    private String name;
    private double english;
    private double math;
    private double science;

    public Students(String sName, double sEnglish, double sMath, double sScience){
        name = sName;
        english = sEnglish;
        math = sMath;
        science =sScience;
    }
    public void getAverage() {
        double saverage = (english + math + science) / 3;
        System.out.println(name + " Got " + saverage);


    }
}
