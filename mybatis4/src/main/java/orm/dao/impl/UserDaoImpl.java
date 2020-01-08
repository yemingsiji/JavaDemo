package orm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import orm.dao.IUserDao;
import orm.domain.User.entity.User;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }


    public List<User> findAll() {

        SqlSession sqlSession = factory.openSession();
        List<User> users = sqlSession.selectList("orm.dao.IUserDao.findAll");//获取配置信息的key
        sqlSession.close();
        return users;
    }

    public void saveUser(User user) {

        //1.根据factory获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2.调用保存方法
        sqlSession.insert("orm.dao.IUserDao.saveUser", user);
        //3.提交事务
        sqlSession.commit();
        //4.释放资源
        sqlSession.close();


    }

    public int updateUser(User user) {

        SqlSession sqlSession = factory.openSession();
        sqlSession.update("orm.dao.IUserDao.updateUser", user);

        //3.提交事务
        sqlSession.commit();
        //4.释放资源
        sqlSession.close();
        return 0;
    }

    public void deleteUser(Integer userId) {
        SqlSession sqlSession = factory.openSession();
        sqlSession.delete("com.itheima.dao.IUserDao.deleteUser", userId);
        sqlSession.commit();
        sqlSession.close();

    }

    public User findById(Integer userId) {


        return null;
    }


    public List<User> findByName(String name) {
        return null;
    }

    public int findTotal() {
        SqlSession sqlSession = factory.openSession();
        int res = sqlSession.selectOne("com.itheima.dao.IUserDao.findTotal");
        sqlSession.close();
        return res;
    }
}
