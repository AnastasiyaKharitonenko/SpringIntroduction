package SpringIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*@Component ("myPerson")*/
public class Person {

    private Pet pet;
    private String surname;
    private int age;

    /*    @Autowired*/
    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;

    }*/

/*


    public Person() {
    }
*/

    public Person(Pet pet) {
        this.pet = pet;

    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет, мой любимый питомец");
        pet.say();
    }


}
