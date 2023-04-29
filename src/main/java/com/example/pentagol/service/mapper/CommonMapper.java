package com.example.pentagol.service.mapper;

public interface CommonMapper<E, D>{
    E toEntity (D d);
    D toDto (E e);
}
