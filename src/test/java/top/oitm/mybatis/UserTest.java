package top.oitm.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.oitm.mybatis.domain.User;
import top.oitm.mybatis.mapper.UserMapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("Oitm");
        user.setAddress("ShangHai");
        user.setSex("男");
        user.setBirthday(new Date());

        int save = userMapper.save(user);
        System.out.println(save);

    }

    @Test
    public void findById(){
        User userById = userMapper.findUserById(27);
        System.out.println(userById);
    }

    @Test
    public void findByUsernameAndSex(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("username","Oitm");
        map.put("sex","男");
        List<User> userByMap = userMapper.findUserByMap(map);
        System.out.println(userByMap);
    }

    // 插入后并返回id
    @Test
    public void saveUserAndBackPrimaryKey(){
        User user = new User();
        user.setUsername("Oitm3");
        user.setAddress("ShangHai3");
        user.setSex("男");
        user.setBirthday(new Date());
        int i = userMapper.saveUserAndBackPrimaryKey(user);
        System.out.println(user);
    }


}
