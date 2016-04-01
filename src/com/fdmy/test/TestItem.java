package com.fdmy.test;

import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fdmy.dao.DAOFactory;
import com.fdmy.dao.IItemDao;
import com.fdmy.model.Item;

public class TestItem {
	private IItemDao dao = null;
	Double price ;
	
	@Before
	public void init(){
		dao = DAOFactory.getItemDao();
	}
	
	
	@Test
	public void testAdd() {
		Item item = new Item();
		item.setCode("test011");
		item.setName("测试修改");
		item.setModel("型号");
		item.setPrice(null);
		dao.add(item);
	}
	
	@Test
	public void testQuery(){
		Item item = new Item();
		item.setCode("test011");
		List<Item>it = dao.query(item);
		for(Item i : it)
		System.out.println(i.getName());
	}

	@Test
	public void testUpdate() {
		Item item = new Item();
		item.setCode("test01");
		item.setName("测试修改");
		item.setModel("型号");
		item.setPrice(0.1);
		dao.update(item);
	}

	@Test
	public void testDelete() {
		dao.delete("test01");
	}

	@Test
	public void testLoad() {
		System.out.println(dao.load("test01").getName());
	}

	@Test
	public void testList() {
		Item queryBean = new Item();
		List<Item> item = dao.query(queryBean);
		System.out.println(item.size());
	}
	
	@Test
	public void temp(){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("one","aaaaaaaaaaaaaa");
		map.put("two","sssssssssssss");
		map.put("three","ddddddddddddd");
		map.put("four","ffffffffffffffff");
		map.put("five","gggggggggggggg");
		map.put("six","hhhhhhhhhhhhhhhhhhhh");
		map.put("seven","jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		
		System.out.println(map.get("two"));
		for(String s : map.values()) {
			System.out.println(s);
			
		}
		
		
	}

}
