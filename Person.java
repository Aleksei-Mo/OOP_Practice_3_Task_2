import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Для класса Person, рассмотренного на уроке написать миниму три реализации интерфейса Comparable, 
//которые будут сортровать набор экземпляров класса Person по разным наборам полей

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
    }

    /* Сортировка по имени и возрасту
     * @Override
     * public int compareTo(Person o) {
     * if (this.name.compareTo(o.name)==0){
     * if (this.age>o.age){
     * return 1;
     * }
     * else if (this.age==o.age){
     * return 0;
     * }
     * else {return -1;
     * }
     * }
     * return this.name.compareTo(o.name);
     * }
     */

   /* Сортировка по возрасту и весу
   @Override
    public int compareTo(Person o) {
        if (Integer.compare(this.age, o.age)==0){
           if (Integer.compare(this.weight, o.weight)==1){
            return 1;
           }
           else if (Integer.compare(this.weight, o.weight)==0){
            return 0;
           }
           else {
            return -1;
           }
        }
        return Integer.compare(this.age, o.age);
    }*/

    /*Сортировка по возрасту и росту
   @Override
    public int compareTo(Person o) {
        if (Integer.compare(this.age, o.age)==0){
           if (Integer.compare(this.height, o.height)==1){
            return 1;
           }
           else if (Integer.compare(this.height, o.height)==0){
            return 0;
           }
           else {
            return -1;
           }
        }
        return Integer.compare(this.age, o.age);
    }*/

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alex", 25, 85, 187));
        people.add(new Person("Bobby", 19, 75, 180));
        people.add(new Person("Kety", 30, 45, 177));
        people.add(new Person("Kety", 19, 45, 163));
        people.add(new Person("Bobby", 39, 61, 180));
        people.add(new Person("John", 45, 81, 177));
        people.add(new Person("Luke", 19, 51, 154));
        Collections.sort(people);
        /*people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.height, o2.height);
            }
        });*/
        System.out.println(people);
    }
}