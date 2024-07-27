package org.example.jpa.repository;

import org.example.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
