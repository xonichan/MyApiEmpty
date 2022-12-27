package com.oniFactory.MyApiEmpty.repo;

import com.oniFactory.MyApiEmpty.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
