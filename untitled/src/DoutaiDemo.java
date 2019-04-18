public class DoutaiDemo {


    public static void main(String args[]){

        Dog d=new Dog();
        Dog d2=new Dog();
        Dog d3=new Dog();

        printAnimal(d);
        printAnimal(d2);
        printAnimal(d3);
        System.out.println("-----------");



        Cat c=new Cat();
        Cat c2=new Cat();
        Cat c3=new Cat();

        printAnimal(c);
        printAnimal(c2);
        printAnimal(c3);

        System.out.println("-----------");

        pig p=new pig();

        pig p2=new pig();
        pig p3=new pig();
        printAnimal(p);
        printAnimal(p2);
        printAnimal(p3);
        System.out.println("-----------");





    }
//    可以用类做为参数 对象,也可以用对象做参数

    public static void printAnimal(Animal a){

        a.eat();
        a.sport();
    }



}
