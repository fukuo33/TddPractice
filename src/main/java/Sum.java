/**
 * Created with IntelliJ IDEA.
 * User: fukuo33
 * Date: 2013/08/11
 * Time: 17:58
 * To change this template use File | Settings | File Templates.
 */
public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
