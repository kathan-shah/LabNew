import static org.junit.Assert.*;

public class RationalTest {

    @org.junit.Test
    public void add() {
<<<<<<< HEAD
        Rational a = new Rational(1,2);
        Rational b = new Rational(1,4);
        a.add(b);
        assertTrue(6 == a.getNum());
        assertTrue(8 == a.getDenom());
=======

>>>>>>> 99be57edb347cf75a5652f863b550c1744f2c1d6
    }

    @org.junit.Test
    public void sub() {
    }

    @org.junit.Test
    public void mul() {
        Rational a = new Rational(1,2);
        Rational b = new Rational(1,4);
        a.mul(b);
        assertTrue(1 == a.getNum());
        assertTrue(8 == a.getDenom());
    }

    @org.junit.Test
    public void div() {
    }
}