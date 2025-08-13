package com.suraj.SpringSecBCrycptPass.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.suraj.SpringSecBCrycptPass.Model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>
{

	Users findByUsername(String username);

}
