package br.com.felipezanella.springbootcontainer.repository;

import br.com.felipezanella.springbootcontainer.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByName(String name);
}
