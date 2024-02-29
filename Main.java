import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Vehicle> rentedVehicle = new ArrayList<>();









        System.out.println("Vehicle Rental System\n" +
                "1. Rent a Car\n" +
                "2. Rent a Bike\n" +
                "3. Rent a Truck\n" +
                "4. View Rented Vehicles\n" +
                "5. Exit");




        int choice = s.nextInt();


        do {



            switch (choice){
                case 1 :
                    System.out.println("Enter Car Model : ");
                    String carModel1 = s.next();
                    carModel1 += s.nextLine();


                    System.out.println("Enter Rental Days : ");
                    int carDays = s.nextInt();

                    Car car =new Car(carModel1 , carDays) ;
                    rentedVehicle.add(car);
                    car.displayDetails();


                    break;



                case 2:

                    System.out.println("Enter Bike Brand : ");
                    String bikeBrand = s.next();
                    bikeBrand += s.nextLine();

                    System.out.println("Enter Rental Hours : ");
                    int bikeHours = s.nextInt();

                    Bike bike = new Bike(bikeBrand , bikeHours);
                    rentedVehicle.add(bike);
                    bike.displayDetails();


                    break;


                case 3 :

                    System.out.println("Enter Truck Type : ");
                    String truckType = s.next();
                    truckType += s.nextLine();

                    System.out.println("Enter Rental Weeks : ");
                    int truckWeeks = s.nextInt();

                    Truck truck = new Truck(truckType , truckWeeks);
                    rentedVehicle.add(truck);
                    truck.displayDetails();

                    break;


                case 4 :
                    System.out.println("Vehicles : ");

                    for (Vehicle vehicle : rentedVehicle){
                        vehicle.displayDetails();

                        System.out.println();
                    }

                    break;

                default:
                    System.out.println("Invalid choice , Please try again. ");

                    break;
            }

            System.out.println("Enter your choice : ");
            choice = s.nextInt();

        } while (choice != 5);
        System.out.println("Thank you for using the Vehicle Rental System ! ");









    } }