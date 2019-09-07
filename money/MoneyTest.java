package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO: [ ] $5 + 10 CHF = $10 (レートが2:1の場合)
 * TODO: [ ] $5 + $5 = $10
 * TODO: [ ] Moneyの丸め処理をどうする？
 * TODO: [ ] hashCode()
 * TODO: [ ] nullとの等価性比較
 * TODO: [ ] 他のオブジェクトとの等価性比較
 * TODO: [ ]
 */

public class MoneyTest {
  @Test
  public void testMultiplication(){
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }
  @Test
  public void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }
  @Test
  public void testSimpleAddition() {
      Money five = Money.dollar(5);
      Expression sum = five.plus(five);
      Bank bank = new Bank();
      Money reduced = bank.reduce(sum, "USD");
      assertEquals(Money.dollar(10), reduced);
  }
}
