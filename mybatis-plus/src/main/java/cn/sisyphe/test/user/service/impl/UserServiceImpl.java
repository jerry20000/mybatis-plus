package cn.sisyphe.test.user.service.impl;

import cn.sisyphe.test.user.mapper.UserMapper;
import cn.sisyphe.test.user.model.User;
import cn.sisyphe.test.user.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：Jerry
 * @date ：Created in 2019/4/30 14:24
 * @description：${description}
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public IPage<User> selectUserPage(Page<User> page, Map<String, Object> condition) {
        return userMapper.selectUserPage(page,condition);
    }

    @Override
    public List<User> selectUserByMap(Map<String, Object> condition) {
        return userMapper.selectUserByMap(condition);
    }
}
