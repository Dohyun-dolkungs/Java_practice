public class Person{
    //instance variables
    private String name;
    private int age;
    private Person spouse;
    
    //static variables
    private static int population = 0;
    
    //constructors
    public Person(){
        name = "newborn"; age = 0;
        population ++;
    }
    
    public Person(String who, int currentAge, Person otherHalf) {
        name = who;
        age = currentAge;
        spouse = otherHalf;
        if(otherHalf != null) otherHalf.spouse = this;
        population ++;
    }
    
    //methods
    
    public void marries(Person other){
        spouse = other;
        other.spouse = this;
    }
    
    public Person clone(){
        return new Person(name, age, spouse);
    }
    
    public boolean isMarried(){
        return spouse !=null;    
    }
    
    public Person getSpouse(){
        return spouse;
    }
    
    public static int census(){
        return population;
    }
    
    public void haveBirthday(){
        age ++;
    }
    
    public void showAge(){
        System.out.println(name + "'s age is " +age);
    }
    
    public void setAgeTo(int age){
        this.age = age;
    }
    
    public void setSameAgeAs(Person other){
        this.age = other.age;
    }
    
    //toString
    public String toString(){
        return name + "(" + age + ")" + " have a good day";
    }
    
    //Accessor and Mutator
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
}