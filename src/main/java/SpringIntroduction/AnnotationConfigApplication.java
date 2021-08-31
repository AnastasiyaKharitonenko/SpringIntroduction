package SpringIntroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
/*        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();*/
        Pet cat = context.getBean("catBean", Pet.class);
        cat.say();

        context.close();
    }
}