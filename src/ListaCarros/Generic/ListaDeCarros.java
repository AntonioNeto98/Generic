package ListaCarros.Generic;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros <T extends Car> {
        private List<T> cars = new ArrayList<>();

        public void addCar(T car) {
            cars.add(car);
        }

        public List<T> getCars() {
            return cars;
        }

        public static void main(String[] args) {
            ListaDeCarros<Car> carList = new ListaDeCarros<>();

            carList.addCar(new Tesla(300, "Electric", "Red"));
            carList.addCar(new Audi(250, "Gasoline", "Black"));
            carList.addCar(new Tesla(400, "Electric", "White"));

            for (Car car : carList.getCars()) {
                System.out.println(car);
            }
        }
    }
