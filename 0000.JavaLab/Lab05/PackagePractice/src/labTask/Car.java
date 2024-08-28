package labTask;

public class Car {
    private String company_name,model_name;
    private int year,milage = 1000;

    public String getModel_name() {
        return model_name;
    }
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMilage() {
        return milage;
    }
}

class main{
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel_name("Lamborgini2024");
        car.setCompany_name("BMW");
        car.setYear(2018);

        System.out.println(car.getModel_name());
        System.out.println(car.getCompany_name());
        System.out.println(car.getYear());
        System.out.println(car.getMilage());

    }
}