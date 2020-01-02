package orm.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import orm.dao.IUserDao;
import orm.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {

        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        sqlSession = factory.openSession();

        userDao = sqlSession.getMapper(IUserDao.class);

    }

    @After
    public void end() throws Exception{
        sqlSession.close();
        in.close();
    }

    @Test
    public void test() throws IOException {

        List<User> users = userDao.findAll();

        for (User user : users
        ) {
            System.out.println(user);
        }


    }

    @Test
    public void test2() throws IOException {

        User user = new User();
        user.setUsername("张三");
        user.setAddress("111111111");
        user.setSex("男");
        user.setBirthday(new Date());


        userDao.saveUser(user);

        //需要提交事务
        sqlSession.commit();



    }


}

