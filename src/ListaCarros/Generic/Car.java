package ListaCarros.Generic;

public abstract class Car {

        private int power;
        private String fuel;
        private String color;

        public Car(int power, String fuel, String color) {
            this.power = power;
            this.fuel = fuel;
            this.color = color;
        }

        public int getPower() {
            return power;
        }

        public String getFuel() {
            return fuel;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Power: " + power + ", Fuel: " + fuel + ", Color: " + color;
        }

}
