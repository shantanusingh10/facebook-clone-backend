package com.shantanu.projects.fbclone.controller;

import com.shantanu.projects.fbclone.model.Post;
import com.shantanu.projects.fbclone.service.PostService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Map;

//@CrossOrigin(value = "http://localhost:3000")
@CrossOrigin(value = "https://fb-clone-fe.herokuapp.com")
@RestController
@RequestMapping("/api/v1/post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post addPost(@RequestParam Map<String,String> requestParams
    ) throws Exception {
        String strPost = requestParams.get("post");
        String email = requestParams.get("email");
        String name = requestParams.get("name");
        String file = requestParams.get("file");
        String profilePic = requestParams.get("profilePic");

        Post post = Post.builder()
                .file(file)
                .name(name)
                .email(email)
                .post(strPost)
                .profilePic(profilePic)
                .timeStamp(new Date().toString())
                .build();
        post = postService.addPost(post);
        return post;
    }

    @GetMapping
    public List<Post> getPost() {
        System.out.println("hello its working");
        return postService.getPost();
    }
}