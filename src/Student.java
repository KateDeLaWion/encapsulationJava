public class Student {
 // private keyword is used in encapsulation.  And setter and getter.
    private int age;
    private String name;
    private String hobby;

    public void setAge(int age){
        this.age = age; }

    public int getAge(){
        return age; }

    public void setName(String name){
        this.name = name; }

    public String getName(){
        return name; }

    public void setHobby(String hobby){
        this.hobby = hobby; }

    public String getHobby(){
        return hobby; }


    // If run the class Student
//    public static void main(String[] args) {
//
//        Student student1 = new Student();
//
//        student1.setName("Dex");
//        student1.setAge(30);
//        student1.setHobby("video games");
//
//        System.out.println("Name; " + student1.getName());
//        System.out.println("Age: " + student1.getAge());
//        System.out.println("Hobby: " + student1.getHobby());
//    }



}





// If run the class Main
class Main{
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setName("Dex");
        student1.setAge(30);
        student1.setHobby("video games");

        System.out.println("Name; " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Hobby: " + student1.getHobby());
    }
}
