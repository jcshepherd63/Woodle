package org.jcshepherd;

public class Animal {
    private String name;
    private String animalClass;
    private String headColor;
    private String mainAnimalLocation;
    public Animal(String name, String animalClass, String mainAnimalColor, String mainAnimalLocation){
        this.name = name;
        this.animalClass = animalClass;
        this.headColor = mainAnimalColor;
        this.mainAnimalLocation = mainAnimalLocation;
    }
    public String getName() {
        return name;
    }
    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getHeadColor() {
        return headColor;
    }

    public void setHeadColor(String headColor) {
        this.headColor = headColor;
    }

    public String getMainAnimalLocation() {
        return mainAnimalLocation;
    }

    public void setMainAnimalLocation(String mainAnimalLocation) {
        this.mainAnimalLocation = mainAnimalLocation;
    }

}
