package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO: [ ] $5 + 10 CHF = $10 (レートが2:1の場合)
 * TODO: [x] $5 * 2 = $10
 * TODO: [ ] amount を privateにする
 * TODO: [ ] Dollarの副作用をどうする？
 * TODO: [ ]  Moneyの丸め処理をどうする？
 */

public class MoneyTest {
  @Test
  public void testMultiplication(){
    Dollar five = new Dollar(5);

    five.times(2);
    assertEquals(10, five.amount);
  }
}
