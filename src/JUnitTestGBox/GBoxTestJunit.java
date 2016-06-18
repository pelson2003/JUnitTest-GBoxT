package JUnitTestGBox;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GBoxTestJunit {

	@Test
	public void test() {
		String name = "kitty";
		Animal animal = new Cat(name);
		Assert.assertTrue(animal.getName().equals(name));		
	}

	@Test
	public void shouldbeAbletoSetandGetAnAnimalAge(){
		// Given
		int age = 5;
		
		// When
		Animal animal = new Cat("newKitty");	
		animal.setAge(age);
		
		// Then
		Assert.assertTrue(animal.getAge() == age);
		
	}
	
}
