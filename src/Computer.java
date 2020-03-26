public class Computer {


    private String name;
    private int year;
    private int cost;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }



    public static void main(String[] args) {

        Computer computer1 = new Computer();

        computer1.setName("Apple");
        computer1.setYear(2019);
        computer1.setCost(3000);

        System.out.println("Name of the computer: " + computer1.getName());
        System.out.println("Year: " + computer1.getYear());
        System.out.println("Cost is: " + computer1.getCost());
    }




}
