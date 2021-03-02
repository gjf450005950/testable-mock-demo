package top.oweb.with;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.testable.core.annotation.MockMethod;
import com.alibaba.testable.core.annotation.MockWith;

/**
 * TODO
 *
 * @version 1.0
 * @date 2021/3/2 11:58
 */
public class JSONObjectMock {

  @MockMethod(targetClass = JSONObject.class)
  public Boolean getBoolean(String key) {
    System.out.println("JSONObjectMock.getBoolean Mock");
    return false;
  }
}
