package cn.sisyphe.demo.core.base.mapper;

import cn.sisyphe.demo.core.base.entity.BaseEntity;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Description:
 * Date: 2019/04/21
 *
 * @author Jerry
 * @version 1.0
 */
public interface BaseMapper<E extends BaseEntity> extends Mapper<E>, MySqlMapper<E>, IdsMapper<E>, ExampleMapper<E> {

}
