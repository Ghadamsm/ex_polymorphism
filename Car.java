public class Car implements Vehicle{

    int days ;
    String model ;



    Car (String model , int days){

        this.model = model ;
        this.days = days ;

    }




    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




    @Override
    public double calculateRentalCost() {
        return days * 50 ;
    }

    @Override
    public void displayDetails() {

        System.out.println("Car Model : " + model);
        System.out.println("Daily Rental Rate : $50 " );
        System.out.println("Rental Cost : $" + calculateRentalCost());


    }
}
