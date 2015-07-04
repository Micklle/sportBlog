package com.sport.blog.daoImpl.test;

import java.util.List;

import javax.inject.Inject;

import org.dbunit.operation.DatabaseOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.sport.blog.dao.UserDAO;
import com.sport.blog.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/dao-context-test.xml" })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
public class UserDaoImplTest extends DBUnitConfig {

	public UserDaoImplTest() {
		super("UserDaoImplTest");
	}

	@Inject
	private UserDAO userDao;

	private User user;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		user = new User();
		user.setId(1);
		user.setEmail("testemail1@gmail.com");
		user.setPassword("qwerty");
		user.setName("user1");
		DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getDataSet());
	}

	@Test
	public void testFindById() {
		User newUser = userDao.getElementByID(1);
		Assert.assertEquals(user.getId(), newUser.getId());
	}

	@Test
	public void testRemove() {
		userDao.deleteElement(user);
		Assert.assertTrue(userDao.getAllElements().size() == 4);
	}

	@Test
	public void testUpdate() {
		User newUser = userDao.getElementByID(1);
		Assert.assertEquals(user.getEmail(), newUser.getEmail());
		newUser.setName("Ivan");
		newUser = userDao.updateElement(newUser);
		Assert.assertEquals("Ivan", newUser.getName());
	}

	@Test
	public void testFindAll() {
		List<User> users = userDao.getAllElements();
		Assert.assertTrue(users.size() == 5);
	}

	@Test
	public void testFindByEmail() {
		User newUser = userDao.getUserByEmail(user.getEmail());
		Assert.assertEquals(user.getEmail(), newUser.getEmail());
	}

	@Test
	public void testFindByUserName() {
		User newUser = userDao.getUserByName(user.getName());
		Assert.assertEquals(user.getName(), newUser.getName());
	}

	@Test
	public void testSave() {
		User newUser = new User();
		newUser.setEmail("testemail6@gmail.com");
		newUser.setName("user6");
		newUser.setPassword("qwerty");
		userDao.addElement(newUser);
		List<User> users = userDao.getAllElements();
		Assert.assertTrue(users.size() == 6);
	}

}
