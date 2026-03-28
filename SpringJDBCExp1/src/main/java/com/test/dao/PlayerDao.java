package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.test.model.Player;

public class PlayerDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int createPlayer(Player p) {
		String sql = "insert into player values("+p.getId()+", '"+p.getName()+"', '"+p.getTeam()+"', '"+p.getPrice()+"')";
		return jdbcTemplate.update(sql);
	}
	public int updatePlayer(Player p) {
		String sql = "update player set p_name = '"+p.getName()+"',p_team = '"+p.getTeam()+"', p_price = '"+p.getPrice()+")";
		return jdbcTemplate.update(sql);
	}
	public int deletePlayer(Player p) {
		String sql = "delete from player where id = "+p.getId();
		return jdbcTemplate.update(sql);
	}
	public List<Player> getAllPlayer(){
		return jdbcTemplate.query("select * from player",
				new ResultSetExtractor<List<Player>>() {
				public List<Player> extractData(ResultSet rs) throws SQLException,DataAccessException{
			List<Player> list=new ArrayList<>();
			while(rs.next()) {
				Player pobj=new Player();
				pobj.setId(rs.getInt(1));
				pobj.setName(rs.getString(2));
				pobj.setTeam(rs.getString(3));
				pobj.setPrice(rs.getInt(4));
				list.add(pobj);
			}
			return list;
		}
				
});
	}
}
