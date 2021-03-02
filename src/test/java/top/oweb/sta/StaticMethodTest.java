package top.oweb.sta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.alibaba.fastjson.JSON;
import com.alibaba.testable.core.annotation.MockWith;
import org.junit.jupiter.api.Test;

/**
 * TODO
 *
 * @version 1.0
 * @date 2021/3/2 11:55
 */
@MockWith(JSONMock.class)
public class StaticMethodTest {

  @Test
  public void testStatic() {
    Object object = JSON.parse("{}");
    assertEquals(object,"mock");
  }
}
