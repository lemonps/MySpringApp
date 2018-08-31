package th.ac.kmutt.sit.MySpringApp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import th.ac.kmutt.sit.MySpringApp.controller.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringAppApplicationTests {

	User user;

	@Before
	public void setUser() throws Exception {
		this.user = new User(1, "Mr.ONE");
	}

	@Test
	public void getUser1() {
		int testId = 1; // expected id
		String testName = "Mr.ONE"; // expected name
		Assert.assertEquals(testId, this.user.getId());
		Assert.assertEquals(testName, this.user.getName());
	}

	@Test
	public void getUser2() {
		this.user.setId(2);
		this.user.setName("Mr.TWO");
		int testId = 2; // expected id
		String testName = "Mr.TWO"; // expected name
		Assert.assertEquals(testId, this.user.getId());
		Assert.assertEquals(testName, this.user.getName());
	}

	@Test
	public void getUser3() {
		this.user.setId(3);
		this.user.setName("Mr.THREE");
		int testId = 3; // expected id
		String testName = "Mr.THREE"; // expected name
		Assert.assertEquals(testId, this.user.getId());
		Assert.assertEquals(testName, this.user.getName());
	}

	@Test
	public void getUser4() {
		this.user.setId(4);
		this.user.setName("Mr.FOUR");
		int testId = 4; // expected id
		String testName = "Mr.FOUR"; // expected name
		Assert.assertEquals(testId, this.user.getId());
		Assert.assertEquals(testName, this.user.getName());
	}

	@Test
	public void getUser5() {
		this.user.setId(5);
		this.user.setName("Mr.FIVE");
		int testId = 5; // expected id
		String testName = "Mr.FIVE"; // expected name
		Assert.assertEquals(testId, this.user.getId());
		Assert.assertEquals(testName, this.user.getName());
	}


}
