package top.oweb.with;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.alibaba.fastjson.JSON;
import com.alibaba.testable.core.annotation.MockWith;
import org.junit.jupiter.api.Test;
import top.oweb.sta.JSONMock;

/**
 * TODO
 *
 * @version 1.0
 * @date 2021/3/2 11:55
 */
@MockWith(JSONMock.class)
public class MockWithTest {

  @Test
  public void testMockWith() {
    Boolean bln = JSON.parseObject("{\"is\":true}").getBoolean("is");
    assertFalse(bln); // bln = true
  }
}
