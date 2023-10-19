package Class18;

public class userClass {

     String name;
     int mobNo;

    public userClass(String name, int mobNo){
        this.name = name;
        this.mobNo = mobNo;
    }

}

class userInfo extends userClass{
     String address;
    public userInfo( String name, int mobNo, String address){
        super(name, mobNo);
        this.address = address;

    }
    public void userDetails(){
        System.out.println(name + " " + mobNo + " "+ address);
    }
    }

class InfoTester {
    public static void main(String[] args) {
        userInfo obj = new userInfo("Ehab", 0522222, "no where to be found") ;
        obj.userDetails();

    }
}


