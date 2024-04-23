package OOP_I;


class Lamp{

    private boolean isOn = true;

    void turnOn(){
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}   

public class ContohPengenalan_1 {
    public static void main(String[] args) {

        
        
        Lamp led = new Lamp();
        // System.out.println(led.isOn); // ini akan error
        Lamp neon = new Lamp();

        led.turnOn();
        neon.turnOff();
    }
}
