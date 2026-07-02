package com.example.week6.controller;


import com.example.week6.dto.PostRequestDTO;
import com.example.week6.dto.PostResponseDTO;
import com.example.week6.service.PostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post/api")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<Page<PostResponseDTO>> getAllPosts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "createdAt") String sortBy)
    {
        return ResponseEntity.ok(postService.findAllPosts(page, size, sortBy));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostResponseDTO> getPostById(@PathVariable Long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }

    @PostMapping
    public ResponseEntity<PostResponseDTO> createPost(@Valid @RequestBody PostRequestDTO requestData){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(postService.createPost(requestData));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostResponseDTO> updatePost(@PathVariable Long id, @Valid @RequestBody PostRequestDTO requestData){
        return ResponseEntity.ok(postService.updatePost(id, requestData));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id){
        postService.deletePost(id);
        return ResponseEntity.ok("Post "+id+" deleted successfully");
    }

    @GetMapping("/search/title")
    public ResponseEntity<List<PostResponseDTO>> searchByTitle(@RequestParam String title){
        return ResponseEntity.ok(postService.searchByTitle(title));
    }

    @GetMapping("/search/author")
    public ResponseEntity<List<PostResponseDTO>> searchByAuthor(@RequestParam String author){
        return ResponseEntity.ok(postService.searchByAuthor(author));
    }
}
