package racinggame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.domain.car.Car;
import racinggame.domain.car.Cars;

class CarTest {

    @DisplayName("Car 움직임 테스트")
    @Test
    public void moveCarsTest() {
        String[] carNames = {"a", "b"};
        Cars cars = new Cars(carNames);
        cars.getCars().get(0).move(new GoRandom());
        cars.getCars().get(1).move(new StayRandom());
        Assertions.assertThat(cars.getCars().get(0).getLocation()).isEqualTo(1);
        Assertions.assertThat(cars.getCars().get(1).getLocation()).isEqualTo(0);

    }

    @DisplayName("Car 위치값 얻기 테스트")
    @Test
    public void getLocationTest() {
        Car car = new Car("a", 7);
        Assertions.assertThat(car.getLocation()).isEqualTo(7);
    }
}
