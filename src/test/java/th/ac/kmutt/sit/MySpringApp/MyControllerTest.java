package th.ac.kmutt.sit.MySpringApp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import th.ac.kmutt.sit.MySpringApp.controller.UserController;
import th.ac.kmutt.sit.MySpringApp.controller.User;


@RunWith(SpringRunner.class)
@SpringBootTest

public class MyControllerTest {

    UserController userController;
    User[] expecteds = {new User(1,"Mr.ONE"),new User(2,"Mr.TWO"),new User(3,"Mr.THREE"),new User(4,"Mr.FOUR"),new User(5,"Mr.FIVE")};;

    @Before
    public void setTestValue() throws Exception {
        this.userController = new UserController();
       /* this.expecteds[0] = new User(1, "Mr.ONE");
        this.expecteds[1] = new User(2, "Mr.TWO");
        this.expecteds[2] = new User(3, "Mr.THREE");
        this.expecteds[3] = new User(4, "Mr.FOUR");
        this.expecteds[4] = new User(5, "Mr.FIVE");*/
    }

    @Test
    public void testAllUsers() {
        Assert.assertArrayEquals(this.expecteds, this.userController.getAllUsers());
    }

}