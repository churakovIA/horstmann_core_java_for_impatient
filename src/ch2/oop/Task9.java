package ch2.oop;

/**
 * Implement a class Car that models a car traveling along the x-axis, consuming gas
 * as it moves. Provide methods to drive by a given number of miles, to add a given
 * number of gallons to the gas tank, and to get the current distance from the origin and
 * fuel level. Specify the fuel efficiency (in miles/gallons) in the constructor. Should
 * this be an immutable class? Why or why not?
 */
public class Task9 {
    public static void main(String[] args) {
        Car car = new Car(20);
        car.refuel(10);
        car.drive(60);
        System.out.println(car);
        car.drive(20);
        System.out.println(car);
        car.drive(Integer.MAX_VALUE);
        System.out.println(car);
    }

    public static class Car {

        private int distance;
        private int fuelLevel;
        private int consumption;

        public Car(int consumption) {
            this.consumption = consumption;
            this.fuelLevel = 0;
            this.distance = 0;
        }

        public void drive(int miles) {
            distance += Math.min(miles, fuelLevel * consumption);
            fuelLevel = Math.max(0, fuelLevel - miles / consumption);
        }

        public void refuel(int gallons) {
            fuelLevel += gallons;
        }

        public int getDistance() {
            return distance;
        }

        public int getFuelLevel() {
            return fuelLevel;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "distance=" + distance +
                    ", fuelLevel=" + fuelLevel +
                    ", consumption=" + consumption +
                    '}';
        }
    }
}
