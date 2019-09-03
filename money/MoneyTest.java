package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO: [ ] $5 + 10 CHF = $10 (レートが2:1の場合)
 * TODO: [x] $5 * 2 = $10
 * TODO: [x] amount を privateにする
 * TODO: [x] Dollarの副作用をどうする？
 * TODO: [ ] Moneyの丸め処理をどうする？
 * TODO: [x] equals()
 * TODO: [ ] hashCode()
 * TODO: [ ] nullとの等価性比較
 * TODO: [ ] 他のオブジェクトとの等価性比較
 * TODO: [x] 5 CHF * 2 = 10 CHF
 * TODO: [ ] DollarとFrancの重複
 * TODO: [x] equalsの一般化
 * TODO: [ ] timesの一般化
 * TODO: [x] FrancとDollarを比較する
 * TODO: [ ] 通貨の概念
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
    assertTrue(Money.franc(5).equals(Money.franc(5)));
    assertFalse(Money.franc(5).equals(Money.franc(6)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }
  @Test
  public void testFrancMultiplication(){
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }
  @Test
  public void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }
}
