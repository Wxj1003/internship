package com.odianyun.internship;

import com.odianyun.internship.model.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: EDZ
 * @time: 10:36
 * @date: 2021/7/13
 */
public class HelloTest {

   /* @Resource
    private OuserService ouserService;

    @Resource
    private OuserMapper ouserMapper;
*/
    @Test
    public void testHello() {
        /*Map<Object, String> map = new HashMap<>();
        map.put("userName", "张三");
        map.put("userName1", "李四");
        map.put("mobile", "13127787865");

        System.out.println(map.get("userName1"));*/
       /* User user = new User();
        user.talk();*/

//        List
// set
        User user = new User();
        user.setUserName("张三");

        User user1 = new User();
        user1.setUserName("李四");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
    }
}
