package com.anleus.creedback.post;

import org.openapitools.api.PostApi;
import org.openapitools.model.PostTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostControllerImpl implements PostApi {

    @Override
    public ResponseEntity<PostTs> createPost(PostTs postTs) {
        return null;
    }

    @Override
    public ResponseEntity<List<PostTs>> getAccountPosts(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<PostTs>> getGroupPosts(String id) {
        return null;
    }
}
