package thread;

public class Bus extends Car implements Runnable {
    public void drive(){
        System.out.println("버스가 달립니다.");
    }
    public void run(){
        drive();
    }
}
