package com.example.week6.repository;
import com.example.week6.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTitleContainingIgnoreCase(String title);

    List<Post> findByAuthorContainingIgnoreCase(String author);
}
