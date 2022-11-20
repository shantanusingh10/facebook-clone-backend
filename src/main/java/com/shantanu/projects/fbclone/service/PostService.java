package com.shantanu.projects.fbclone.service;

import com.shantanu.projects.fbclone.model.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {

    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
