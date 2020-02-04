class Animals { // this would be the parent class
void bark(){System.println('eating...'); // this is the method that all other
//instances of this Animals class will share

}

//overall this style of inheritance is called hierarchical because the
//next few instances will share the bark() method of the parent class Animals

class Dog extends Animals {
  void bark(){System.out.println('barking...'); //bark() is a method unique to the class Dog

} //Dog  is now connected to the parent class Animals

class Cow extends Animals{
        void moo(){System.outprintln('mooing...');//moo() is a method unique to the class Cow

} //Cow is now connected to the parent class Animals

class Cat extends Animals {
        void meow(){System.outprintln('meowing...');//meow() is a method unique to the class Cat

} //Cat is now connected to the parent class Animals

class Inherit {
        public state void main(String arg[]) {
          Dog d = new Dog() //creates a new instance of Dog and sets it to the variable d
          d.bark();
          d.eat();//eat and bark are methods that are called bark() is native to the Dog but eat is pulled      from the parent Class Animals

        }
}

//now we repeat this for each child class

class Inherit {
        public state void main(String arg[]) {
          Cow c = new Cow()
          c.moo();
          c.eat();
        }
}

class Inherit {
        public state void main(String arg[]) {
          Cat k = new Cat()
          k.meow();
          k.eat();
        }
}
