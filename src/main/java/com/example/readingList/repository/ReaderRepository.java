package com.example.readingList.repository;

import com.example.readingList.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
