package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() { user = new User(1, "Fernanda", "Guerra"); }

    @Test
    void testUserFullName() {assertEquals("Fernanda Guerra", user.fullName());}

    @Test
    void testUserInitials() {assertEquals("F.", user.initials());}

    @Test
    void testUserNumber() {assertEquals(1, user.getNumber());}

    @Test
    void testUserName() {assertEquals("Fernanda", user.getName());}

    @Test
    void testUserFamilyName() {assertEquals("Guerra", user.getFamilyName());}

    @Test
    void testGetNameUpperCase() { assertEquals("FERNANDA", user.getNameUpperCase());}

}
