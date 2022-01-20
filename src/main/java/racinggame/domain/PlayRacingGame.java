package racinggame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayRacingGame {

    public int makeRandomNumber(){
        Random random = new Random();
        int randomValue=random.nextInt(9);
        return randomValue;
    }

    public void move(List<Car> cars){
        for (Car car:cars) {
            int randomNumber = makeRandomNumber();
            if(randomNumber>=4){
                int location = car.getLocation();
                location++;
                car.setLocation(location);
            }
        }

    }

    public void printCarsLocation(List<Car>cars){
        for (Car car:cars) {
            System.out.print(car.getCarName()+": "+"");
            for(int i=0;i<car.getLocation();i++){
                System.out.print('-');
            }
            System.out.println();
        }
        System.out.println();
    }

    public int findMaxLocation(List<Car>cars){
        int maxLocation=0;
        for (Car car:cars) {
            maxLocation=Math.max(car.getLocation(),maxLocation);
        }
        return maxLocation;
    }


}
