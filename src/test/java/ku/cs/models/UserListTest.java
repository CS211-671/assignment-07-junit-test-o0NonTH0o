package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "password01");
        userList.addUser("user02", "password02");
        userList.addUser("user03", "password03");

        // TODO: find one of them
        User user = userList.findUserByUsername("user02");
        assertNotNull(user);

        // TODO: assert that UserList found User
        String expected = "user02";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList userList = new UserList();
        // TODO: add 3 users to UserList
        userList.addUser("user01", "password01");
        userList.addUser("user02", "password02");
        userList.addUser("user03", "password03");

        // TODO: change password of one user
        boolean actual = userList.changePassword("user02", "password02", "newPassword02");
        assertTrue(actual);

        // TODO: assert that user can change password
        User user = userList.findUserByUsername("user02");
        assertNotNull(user);
        // assertTrue(actual);
        assertTrue(user.validatePassword("newPassword02"));
    }


    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "password01");
        userList.addUser("user02", "password02");
        userList.addUser("user03", "password03");

        // TODO: call login() with correct username and password
        User user = userList.login("user02", "password02");
        assertNotNull(user);

        // TODO: assert that User object is found
        String expected = "user02";
        String actual = user.getUsername();
        assertEquals(expected, actual);
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "password01");
        userList.addUser("user02", "password02");
        userList.addUser("user03", "password03");

        // TODO: call login() with incorrect username or incorrect password
        User user = userList.login("user02", "wrongPassword");

        // TODO: assert that the method return null
        // assertNull(actual);
        assertNull(user);
    }

}