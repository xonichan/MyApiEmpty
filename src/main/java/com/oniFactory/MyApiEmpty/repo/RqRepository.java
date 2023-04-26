package com.oniFactory.MyApiEmpty.repo;

import com.oniFactory.MyApiEmpty.models.PostRq;
import org.springframework.data.repository.CrudRepository;

public interface RqRepository extends CrudRepository<PostRq, Long> {
}
