package cn.sisyphe.demo.user.service.impl;

import cn.sisyphe.demo.core.base.Pagination;
import cn.sisyphe.demo.user.mapper.UserMapper;
import cn.sisyphe.demo.user.model.User;
import cn.sisyphe.demo.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Jerry
 * @date ：Created in 2019/4/20 23:54
 * @description：${description}
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteUserById(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public List<User> selectByExample(String userName) {
        return userMapper.selectByUserExample(userName);
    }

    @Override
    public PageInfo<User> listByEntityAndPage(User entity, Pagination pagination) {
        return PageHelper
                .offsetPage(pagination.getOffset(), pagination.getLimit())
                .doSelectPageInfo(() -> userMapper.select(entity));
    }
}
