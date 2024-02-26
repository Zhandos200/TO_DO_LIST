//Task1
public class Person {
    String name;
    int age;
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "Zhandos";
        myObj.age = 17;
        System.out.println("Name: " + myObj.name);
        System.out.println("Age: " + myObj.age);
    }
}
// //Task2
// public class Person {
//     public static void main(String[] args) {
//         Person myObj = new Person();
//         myObj.printDetails(17, "Zhandos");
//     }
//     public void printDetails(int age, String name){
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }
// /* Task3 */
// public class Person {
//     private String name;
//     private int age;
//     public static void main(String[] args) {
//         Person myObj = new Person();
//         myObj.setName("Zhandos");
//         System.out.println("Name: " + myObj.getName());
//         myObj.setAge(17);
//         System.out.println("Age: " + myObj.getAge());
//     }
//     public String getName(){
//         return name;
//     }
//     public int getAge(){
//         return age;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public void setAge(int age){
//         this.age = age;
//     }
// }
// //Task 4
// public class Person {
//     private String name;
//     private int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void printDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public static void main(String[] args) {
//         Person person1 = new Person("Zhandos", 17);
//         person1.printDetails();
//     }
// }


