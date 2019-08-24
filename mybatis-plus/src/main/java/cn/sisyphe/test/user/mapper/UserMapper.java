package cn.sisyphe.test.user.mapper;

import cn.sisyphe.test.user.model.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author miemie
 * @since 2018-08-12
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 自定义分页查询
     *
     * @return 分页数据
     */
    Page<User> selectUserPage(Page<User> page, @Param("condition")Map<String, Object> condition);


    List<User> selectUserByMap(@Param("condition")Map<String, Object> condition);
}
