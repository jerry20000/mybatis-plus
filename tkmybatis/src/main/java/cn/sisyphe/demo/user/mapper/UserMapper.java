package cn.sisyphe.demo.user.mapper;

import cn.sisyphe.demo.user.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserMapper extends Mapper<User> {

    @Select("SELECT * FROM demo_user WHERE user_name = #{userName}")
    User selectByUserName(@Param("userName") String userName);

    List<User> selectByUserExample(String sample);
}