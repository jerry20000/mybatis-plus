package cn.sisyphe.test.user.service;

import cn.sisyphe.test.user.model.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author ：Jerry
 * @date ：Created in 2019/4/20 23:53
 * @description：${description}
 */
public interface UserService extends IService<User> {

    IPage<User> selectUserPage(Page<User> page, Map<String, Object> condition);

    List<User> selectUserByMap(Map<String, Object> condition);
}
