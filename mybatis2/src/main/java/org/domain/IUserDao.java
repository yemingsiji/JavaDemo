package org.domain;

import org.domain.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有的配置
     *
     * @return
     */

    List<User> findAll();
}
