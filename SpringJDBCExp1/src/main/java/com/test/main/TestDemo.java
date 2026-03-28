package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.PlayerDao;
import com.test.dao.PlayerDao1;
import com.test.model.Player;
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		PlayerDao dao = ctx.getBean("pdao2",PlayerDao.class);
		PlayerDao1 dao1 = ctx.getBean("pdao1",PlayerDao1.class);
		Player obj = new Player();
		obj.setId(111);
		obj.setName("Rohit");
		obj.setTeam("Mumbai");
		obj.setPrice(1234);
		dao.createPlayer(obj);
		List<Player> list = dao.getAllPlayer();
		list.forEach(System.out::println);
		System.out.println("Done");
		
	}

}
