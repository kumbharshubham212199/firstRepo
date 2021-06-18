package com.pract;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pract.Studentdao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/pract/config.xml");
        StudentDao studentdao = context.getBean("dao",StudentDao.class);
        Student st=new Student(1,"shubham","pune");
     
        studentdao.insert(st);
    }
}
