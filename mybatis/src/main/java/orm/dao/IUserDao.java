package orm.dao;

import orm.domain.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有的操作
     * @return
     * */


    List<User> findAll();


}
