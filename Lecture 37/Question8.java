A Java enum type can have a private constructor that can be used to initialize instance fields. Which means Java Enum can have a constructor to pass data while creating Enum constants. This feature allows you to associate related data together. Let us consider this with example.

public enum TrafficSignal{
    
    RED("wait"), GREEN("go"), ORANGE("slow down"); //this will call enum constructor with one String argument
  
    private String action;
  
    public String getAction(){ // enum constructor - can not be public or protected
        return this.action; 
    }
  
   
    TrafficSignal(String action){
        this.action = action;
    }
}
In the above example, Enum, where we pass the action to each Enum instance e.g. GREEN, is associated with go, RED is associated with stop and ORANGE is associated with the slowdown.. We can also provide one or more constructor to Enum as it also supports constructor overloading like normal Java classes.

Just remember that constructor in enums an only be either private or package level it can't be public or protected hence access modifier public and protected are not allowed to Enum constructor, it will result in compile-time error


ANSWERS 


In enum the constructor is only private
Constructor overloading can be applied in enum