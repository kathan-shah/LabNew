public class Rational {
    private int num;
    private int denom;

    public Rational (int num, int denom){
        this.num = num;
        this.denom = denom;
    }

    public void setNum (int num){
        num = num;
    }
    public void setDenom (int denom){
        denom = denom;
    }

    public int getNum (){
        return num;
    }
    public int getDenom () {
        return denom;
    }

    public void add(Rational r){
        this.num = (this.num * r.denom) + (r.num * this.denom);
        this.denom = this.denom * r.denom;
    }

    public void sub(Rational r){
        this.num = (this.num * r.denom) - (r.num * this.denom);
        this.denom = this.denom * r.denom;
    }

    public void mul(Rational r){
        this.num = this.num * r.num;
        this.denom = this.denom * r.denom;
    }

    public void div(Rational r){
        this.num = this.num * r.denom;
        this.denom = this.denom * r.num;
    }

}