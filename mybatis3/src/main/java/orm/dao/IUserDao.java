package orm.dao;

import orm.domain.User.entity.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有的操作
     *
     * @return
     */


    List<User> findAll();


    /**
     * 保存用户
     *
     * @param user
     */
    void saveUser(User user);


    /**
     * 更新用户
     *
     * @param
     */
    int updateUser(User user);

    /**
     * 删除用户
     */

    void deleteUser(Integer userId);

    /**
     * 模糊查询
     */
    List<User> findByName(String name);

    /***
     *  查询总用户数
     */

    int findTotal();
}
