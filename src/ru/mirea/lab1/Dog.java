
    import java.lang.*;
    public class Dog {
        private String name;
        private int age;
        private double weight;
        private String color;

        public Dog(String n, int a, double w, String c){
            name = n;
            age = a;
            weight = w;
            color = c;
        }
        public Dog(String n, int a){
            name = n;
            age = 0;
            weight =0;
            color = "grey";
        }
        public Dog(String n){
            name = n;
            age = 0;
            weight = 0.0;
            color = "black";
        }

        public Dog() {
            name = "Pup";
            age = 0;
            weight = 0.0;
            color = "white";

        }
        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName(String name){
            return name;
        }

        public String getColor(){
            return color;
        }
        public double getWeight(){
            return weight;
        }
        public int getAge() {
            return age;
        }

        public String toString(){
            return this.name+", age "+this.age + ", color " + this.color + ", weight " + this.weight;
        }

        public void intoHumanAge(){
            System.out.println(name+"'s age in human years is "+age*7+" years");
        }
    }
