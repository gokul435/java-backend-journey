package com.example.week6.service;
import com.example.week6.dto.PostRequestDTO;
import com.example.week6.dto.PostResponseDTO;
import com.example.week6.exception.PostNotFoundException;
import com.example.week6.model.Post;
import com.example.week6.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    PostRepository postRepo;

    private PostResponseDTO toResponseDto(Post post){
        PostResponseDTO dto = new PostResponseDTO();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        dto.setAuthor(post.getAuthor());
        dto.setCreatedAt(post.getCreatedAt());
        dto.setUpdatedAt(post.getUpdatedAt());

        return dto;
    }

    private Post toEntity(PostRequestDTO dto){
        Post post = new Post();

        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());
        post.setAuthor(dto.getAuthor());

        return post;
    }

    public PostResponseDTO createPost(PostRequestDTO dto){
        Post post = toEntity(dto);
        Post saved = postRepo.save(post);
        return toResponseDto(saved);
    }

    public List<PostResponseDTO> findAllPosts(){
        List<Post> posts = postRepo.findAll();
        return posts.stream().map(this::toResponseDto).collect(Collectors.toList());
    }

    public PostResponseDTO getPostById(Long id){
        Post post = postRepo.findById(id).orElseThrow(()->new PostNotFoundException("Post not found with id; "+ id));
        return toResponseDto(post);
    }

    public PostResponseDTO updatePost(Long id, PostRequestDTO dto){
        Post post = postRepo.findById(id).orElseThrow(()-> new PostNotFoundException("Post not found with id; "+ id));

            post.setTitle(dto.getTitle());
            post.setContent(dto.getContent());
            post.setAuthor(dto.getAuthor());
            Post updated = postRepo.save(post);
            return toResponseDto(updated);
    }

    public void deletePost(Long id){

        if(!postRepo.existsById(id)){
            throw new PostNotFoundException("Post not found with id; "+ id);
        }
        postRepo.deleteById(id);
    }

    public List<PostResponseDTO> searchByTitle(String title){
        return postRepo.findByTitleContainingIgnoreCase(title).stream()
                .map(this::toResponseDto).collect(Collectors.toList());
    }

    public List<PostResponseDTO> searchByAuthor(String author){
        return postRepo.findByAuthorContainingIgnoreCase(author).stream()
                .map(this::toResponseDto).collect(Collectors.toList());
    }

}
