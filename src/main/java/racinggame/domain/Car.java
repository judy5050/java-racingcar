package racinggame.domain;

public class Car {
    private String carName;
    int location=0;
    public Car(String carName){
        this.carName=carName;
    }

    public void goForward(int value){
        if(value>=4){
            location++;
        }
    }



}
