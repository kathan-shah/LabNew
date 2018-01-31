import static org.junit.Assert.*;

public class RationalTest {

    @org.junit.Test
    public void add() {
        Rational a = new Rational(1,2);
        Rational b = new Rational(1,4);
        a.add(b);
        assertTrue(6 == a.getNum());
        assertTrue(8 == a.getDenom());
    }

    @org.junit.Test
    public void sub() {
       Rational a =  new Rational(1,2);
       Rational b = new Rational(4,5);
       a.sub(b);
       boolean result

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
        Rational a =  new Rational(1,2);
        Rational b = new Rational(4,5);
        a.div(b);
    }
}