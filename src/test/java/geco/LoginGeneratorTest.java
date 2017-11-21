package geco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rlm0843a on 21/11/2017.
 */
public class LoginGeneratorTest {

    LoginService loginService = new LoginService(new String[] {"JROL", "BPER",
            "CGUR", "JDUP", "JRAL", "JRAL1"});
    LoginGenerator loginGenerator = new LoginGenerator(loginService);

    @Test
    public void TestGenPaulDurand(){
        assertEquals(
                loginGenerator.generateLoginForNomAndPrenom(
                        "Durand", "Paul")
                , "PDUR");
    }

    @Test
    public void TestGenJohnRalling(){
        assertEquals(
                loginGenerator.generateLoginForNomAndPrenom(
                        "Ralling", "John")
                , "JRAL2");
    }

    /*@Test
    public void TestGenJeanRolling(){
        assertEquals(
                loginGenerator.generateLoginForNomAndPrenom(
                        "Rolling", "Jean")
                , "JROL1");
    }

    @Test
    public void TestGenPaulDuurand(){
        assertEquals(
                loginGenerator.generateLoginForNomAndPrenom(
                        "Dùrand", "Paul")
                , "PDUR");
    }*/
}