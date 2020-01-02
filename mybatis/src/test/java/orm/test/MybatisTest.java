package orm.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import orm.dao.IUserDao;
import orm.domain.User;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {


    /*
     *
     * */
    public static void main(String[] args) throws IOException {
        //1.读取配置文件 Resources.这个是mybatis的方法，用于获取SqlMapConfig.xml数据库配置文件
//        InputStream 为一个io的类，用于读取这个配置文件 根据配置文件创建Connection对象
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFaction工厂

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        //3.使用工厂产生SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
