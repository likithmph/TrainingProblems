package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.PlayerDao2;
import com.test.model.Player;

public class TestDemo1 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		PlayerDao2 dao = ctx.getBean(PlayerDao2.class);
		Player obj=new Player();
		obj.setId(123);
		obj.setName("sushanth");
		obj.setTeam("ka");
		obj.setPrice(655);
		dao.createPlayer(obj);
		System.out.println("Done");
		List<Player> list = dao.listAllPlayer();
		list.forEach(System.out::println);
	}
}
