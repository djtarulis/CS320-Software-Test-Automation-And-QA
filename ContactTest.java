package schooltest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import school.Contact;

class ContactTest {

	/**
	 * Create baseline tests to check if values are the same
	 * as the ones that are assigned
	 */
	
	@Test
	void testContact() {
		Contact Contact = new Contact("Java", "Class", "012345", "2197412369", "123 Evergreen Terrace");
		assertTrue(Contact.getfirstName().equals("Java"));
		assertTrue(Contact.getlastName().equals("Class"));
		assertTrue(Contact.getId().equals("012345"));
		assertTrue(Contact.getPhone().equals("2197412369"));
		assertTrue(Contact.getAddress().equals("123 Evergreen Terrace"));
	}

	void testfirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("FirstNameLong", "Class", "012345", "2197412369", "123 Evergreen Terrace");
		});		}
	void testlastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Java", "LastNameLong", "012345", "2197412369", "123 Evergreen Terrace");
		});		}
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Java", "Class", "012345678910", "2197412369", "123 Evergreen Terrace");
		});		}
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Java", "Class", "012345", "21974", "123 Evergreen Terrace");
		});		}
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Java", "Class", "012345", "21974123699999", "123 Evergreen Terrace");
		});		}
	void testPhoneNonNumeric() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Java", "Class", "012345", "abcdefghij", "123 Evergreen Terrace");
		});		}
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Java", "Class", "012345", "2197412369", "123 Evergreen Terrace Lane Road Avenue Street Bridge");
		});		}
}
