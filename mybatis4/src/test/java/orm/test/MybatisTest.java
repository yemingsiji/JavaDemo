package orm.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import orm.dao.IUserDao;
import orm.dao.impl.UserDaoImpl;
import orm.domain.User.entity.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    private InputStream in;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {

        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);


        userDao = new UserDaoImpl(factory);

    }

    @After
    public void endClose() throws Exception {
        in.close();
    }

    @Test
    public void testSelect() throws IOException {

        List<User> users = userDao.findAll();
        for (User user : users
        ) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsert() throws IOException {

        User user = new User();
        user.setUsername("张三");
        user.setAddress("111111111");
        user.setSex("男");
        user.setBirthday(new Date());
        System.out.println("保存之前"+user);
        userDao.saveUser(user);
        System.out.println("保存之后"+user);
    }
//
//
//    /**
//     *
//     *   更新相关信息
//     * */
    @Test
    public void testUpdate() {


        User user = userDao.findById(50);

        user.setAddress("北京市顺义区");
        int res = userDao.updateUser(user);
        System.out.println(res);




    }
//
//
//    /***
//     *
//     *  根据id进行删除
//     *
//     */
//
//    @Test
//    public void deleteId() {
//        userDao.deleteUser(57);
//
//
//    }
//
    /*
    * 根据用户id进行查询
    * */
//    @Test
//    public void testSelectOne() {
//
//        User user = userDao.findById(58);
//        System.out.println(user);
//    }
////
//
//    /**
//     * 根据name进行模糊查询
//     */
//
//    @Test
//    public void testlikeName(){
//        List<User> users = userDao.findByName("%王%");
//        for (User user:users
//             ) {
//            System.out.println(user);
//
//        }
//    }
//
//
//    /**
//     *  查询全部用户条数
//     * */
//    @Test
//    public void testCount(){
//
//        int total = userDao.findTotal();
//        System.out.println(total);
//    }

}

