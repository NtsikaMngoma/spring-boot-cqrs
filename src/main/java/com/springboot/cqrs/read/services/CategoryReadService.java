package com.springboot.cqrs.read.services;import com.springboot.cqrs.read.dto.CategoryReadDTO;import org.springframework.data.domain.Pageable;import java.util.List;import java.util.Optional;public interface CategoryReadService{    List<CategoryReadDTO> getAll();    List<CategoryReadDTO> getAllActive();    List<CategoryReadDTO> getPage(Pageable pageable);    Optional<CategoryReadDTO> getById(Long id);}