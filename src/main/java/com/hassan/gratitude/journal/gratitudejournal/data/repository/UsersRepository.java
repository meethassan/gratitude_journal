package com.hassan.gratitude.journal.gratitudejournal.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hassan.gratitude.journal.gratitudejournal.data.entity.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users,Long> {
}
