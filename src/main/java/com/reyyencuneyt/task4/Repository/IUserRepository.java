package com.reyyencuneyt.task4.Repository;

import com.reyyencuneyt.task4.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends JpaRepository<UserEntity,Long> {
}
