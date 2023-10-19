package Class19;

public class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree a masters you need a bachelors");
    }
}

class DegreeTester {
    public static void main(String[] args) {
        new Degree().getPrerequisite();
        new Bachelors().getPrerequisite();
        new Masters().getPrerequisite();

    }
}