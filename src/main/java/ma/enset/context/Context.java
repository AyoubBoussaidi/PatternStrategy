package ma.enset.context;

import ma.enset.strategy.Pay;

public class Context {
    Pay pay;
    public Context(Pay pay) {
        this.pay = pay;
    }
    public void effectuerStrategy(){
        pay.operation();
    }
}
