package SpringIntroduction;

import org.springframework.stereotype.Component;

/*@Component ("dogBean")*/
public class Dog implements Pet {
    public Dog() {
    }

    @Override
    public void say() {
        System.out.println("Собака говорит гав-гав!");
    }
}
