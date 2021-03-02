package top.oweb.sta;

import com.alibaba.fastjson.JSON;
import com.alibaba.testable.core.annotation.MockMethod;

/**
 * TODO
 *
 * @version 1.0
 * @date 2021/3/2 11:58
 */
public class JSONMock {

  @MockMethod(targetClass = JSON.class)
  public static Object parse(String text) {
    return "mock";
  }
}
