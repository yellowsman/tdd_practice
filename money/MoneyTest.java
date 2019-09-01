package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO: [ ] $5 + 10 CHF = $10 (レートが2:1の場合)
 * TODO: [x] $5 * 2 = $10
 * TODO: [ ] amount を privateにする
 * TODO: [x] Dollarの副作用をどうする？
 * TODO: [ ]  Moneyの丸め処理をどうする？
 * TODO: [ ]  equals()
 * TODO: [ ]  hashCode()
 */

public class MoneyTest {
  @Test
  public void testMultiplication(){
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
  }
}
