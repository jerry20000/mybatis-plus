package cn.sisyphe.demo.core.base.service;

import cn.sisyphe.demo.core.base.entity.BaseEntity;
import com.github.pagehelper.PageInfo;
import cn.sisyphe.demo.core.base.Pagination;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Description:
 * Date: 2019/04/21
 *
 * @author Jerry
 * @version 1.0
 */
public interface BaseService<E extends BaseEntity> {

    void save(final E entity);

    void save(final List<E> entities);

    void update(final E entity);

    void remove(final Long id);

    void removeByIds(final String ids);

    E get(final Long id);

    List<E> list();

    List<E> listByIds(final String ids);

    List<E> listByEntity(final E entity);

    List<E> listByExample(final Example example);

    PageInfo<E> listByPage(final Pagination pagination);

    PageInfo<E> listByEntityAndPage(final E entity, final Pagination pagination);

    PageInfo<E> listByExampleAndPage(final Example example, final Pagination pagination);

    int count();

}
