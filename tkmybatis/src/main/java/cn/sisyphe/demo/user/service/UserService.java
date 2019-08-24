package cn.sisyphe.demo.user.service;

import cn.sisyphe.demo.core.base.Pagination;
import cn.sisyphe.demo.user.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author ：Jerry
 * @date ：Created in 2019/4/20 23:53
 * @description：${description}
 */
public interface UserService {

    int deleteUserById(Long id);

    int insertUser(User user);

    List<User> selectAll();

    User getUserById(Long id);

    User selectByUserName(String userName);

    List<User> selectByExample(String sample);

    PageInfo<User> listByEntityAndPage(User entity, Pagination pagination);
}
