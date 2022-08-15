package oop;

public class Animal {

    //Fields
    private String type;
    private String breed;
    private float weight;
    private int avgLifespan;

    //Custom constructor
    public Animal(String type, String breed, float weight, int avgLifespan){
        this.type = type;
        this.weight = weight;
        this.breed = breed;
        this.avgLifespan = avgLifespan;


    }
    public Animal (){

    }
    public Animal(String type, String breed, float weight) {
        this.type = type;
        this.weight = weight;
        this.breed = breed;

    }
    public void setAvgLifespan (int avgLifespan){
        this.avgLifespan = avgLifespan;
    }
    public void printAnimalInfo(){
        System.out.println("Type: " + type);
        System.out.println("Breed: " + breed );
        System.out.println("Weight: "+ weight + "kg");
        System.out.println("Average Lifespan:"+ avgLifespan + " years");


    }

}
