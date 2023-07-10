package com.groupeisi.m2gl.david_ndecky;

import com.groupeisi.m2gl.david_ndecky.controller.PalindromeController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DavidNdeckyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testIsPalindrome() {
		PalindromeController palindromeController = new PalindromeController();

		// Test d'un mot palindrome
		boolean isPalindrome = palindromeController.checkPalindrome("kayak").getBody();
		assertTrue(isPalindrome);

		// Test d'un mot qui n'est pas un palindrome
		isPalindrome = palindromeController.checkPalindrome("hello").getBody();
		assertFalse(isPalindrome);
	}

}
