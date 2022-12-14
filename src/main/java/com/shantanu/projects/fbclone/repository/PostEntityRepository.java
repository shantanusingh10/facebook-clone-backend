package com.shantanu.projects.fbclone.repository;

import com.shantanu.projects.fbclone.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String> {

}
