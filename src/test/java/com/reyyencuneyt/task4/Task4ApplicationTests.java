package com.reyyencuneyt.task4;

import com.reyyencuneyt.task4.Entity.UserEntity;
import com.reyyencuneyt.task4.Repository.IUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Task4ApplicationTests implements ITestData{

	@Autowired
	IUserRepository repository;


	@Override
	@Test
	public void testCreate() {
		UserEntity userEntity=UserEntity.builder().name("reyyen").email("rrayyan213@gmail.com").build();
		repository.save(userEntity);
		//databaseye eklenecek ilk data birinci datadir.
		assertNotNull(repository.findById(1L).get());//sana soylecegim id bilesenlerim egerki burada yoksa, exception firlatsin
	}

	@Override
	@Test
	public void testFind() {
		UserEntity userEntity=repository.findById(1L).get();
		assertEquals("reyyen",userEntity.getName());
	}

	@Override
	@Test
	public void testList() {
		List<UserEntity> entityList=repository.findAll();
		assertThat(entityList).size().isGreaterThan(0);//eger listedeki sayisi sifirdan buyukse liste var demek
	}

	@Override
	@Test
	public void testDelete() {
		repository.deleteById(1L);
		assertThat(repository.existsById(1L)).isFalse();
	}

	@Override
	@Test
	public void testUpdate() {
		UserEntity userEntity=repository.findById(1L).get();
		userEntity.setName("reyyen44");
		repository.save(userEntity);
		assertNotEquals("reyyen",repository.findById(1L).get().getName());
	}

}
