package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO: [ ] $5 + 10 CHF = $10 (レートが2:1の場合)
 * TODO: [x] $5 * 2 = $10
 * TODO: [x] amount を privateにする
 * TODO: [x] Dollarの副作用をどうする？
 * TODO: [ ]  Moneyの丸め処理をどうする？
 * TODO: [x]  equals()
 * TODO: [ ]  hashCode()
 * TODO: [ ]  nullとの等価性比較
 * TODO: [ ]  他のオブジェクトとの等価性比較
 * TODO: [x]  5 CHF * 2 = 10 CHF
 * TODO: [ ]  DollarとFrancの重複
 * TODO: [ ]  equalsの一般化
 * TODO: [ ]  timesの一般化
 * TODO: [ ]
 */

public class MoneyTest {
  @Test
  public void testMultiplication(){
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
  }
  @Test
  public void testFrancMultiplication(){
    Franc five = new Franc(5);
    assertEquals(new Franc(10), five.times(2));
    assertEquals(new Franc(15), five.times(3));
  }
}
