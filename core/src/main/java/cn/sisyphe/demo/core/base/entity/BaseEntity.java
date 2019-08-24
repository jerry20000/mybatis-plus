package cn.sisyphe.demo.core.base.entity;

import java.io.Serializable;

/**
 * Description:
 * Date: 2019/04/21
 *
 * @author Jerry
 * @version 1.0
 */
public interface BaseEntity extends Serializable {

    Long getId();

    boolean isNew();

}
