package cn.sisyphe.demo.core.base.service;

import cn.sisyphe.demo.core.base.entity.BaseEntity;
import cn.sisyphe.demo.core.base.mapper.BaseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.sisyphe.demo.core.base.Pagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Description:
 * Date: 2019/04/21
 *
 * @author Jerry
 * @version 1.0
 */
@Transactional
public abstract class AbstractBaseService/*<E extends BaseEntity> implements BaseService<E>*/ {

 /*   protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected BaseMapper<E> mapper;

    protected Class<E> entityClass;

    @SuppressWarnings("unchecked")
    public AbstractBaseService() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        entityClass = (Class<E>) parameterizedType.getActualTypeArguments()[0];
    }

    @Override
    public void save(E entity) {
        mapper.insertSelective(entity);
    }

    @Override
    public void save(List<E> entities) {
        mapper.insertList(entities);
    }

    @Override
    public void update(E entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public void remove(Long id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void removeByIds(String ids) {
        mapper.deleteByIds(ids);
    }

    @Override
    public E get(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<E> list() {
        return mapper.selectAll();
    }

    @Override
    public List<E> listByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<E> listByEntity(E entity) {
        return mapper.select(entity);
    }

    @Override
    public List<E> listByExample(Example example) {
        return mapper.selectByExample(example);
    }

    @Override
    public PageInfo<E> listByPage(Pagination pagination) {
        return PageHelper
                .offsetPage(pagination.getOffset(), pagination.getLimit())
                .doSelectPageInfo(() -> mapper.selectAll());
    }

    @Override
    public PageInfo<E> listByEntityAndPage(E entity, Pagination pagination) {
        return PageHelper
                .offsetPage(pagination.getOffset(), pagination.getLimit())
                .doSelectPageInfo(() -> mapper.select(entity));
    }

    @Override
    public PageInfo<E> listByExampleAndPage(Example example, Pagination pagination) {
        return PageHelper
                .offsetPage(pagination.getOffset(), pagination.getLimit())
                .doSelectPageInfo(() -> mapper.selectByExample(example));
    }

    @Override
    public int count() {
        return mapper.selectCount(null);
    }*/
}
