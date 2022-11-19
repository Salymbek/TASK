package project111;

public class Driver extends Employee{

    public void driving(){
        System.out.println("DRIVER VERY WELL");
    }






    @Override
    public void firstAid() {
        System.out.println("DRIVER FIRST AID");
    }

    @Override
    public void swim() {
        System.out.println("THE DRIVER CAN SWIM");
    }
}
