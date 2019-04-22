package top.oitm.mybatis.mapper;

import top.oitm.mybatis.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    int save(User user);

    User findUserById(int id);

    List<User> findUserByMap(Map<String, Object> map);

    int saveUserAndBackPrimaryKey(User user);

}
