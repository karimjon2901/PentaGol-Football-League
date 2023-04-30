package com.example.pentagol.service.mapper;

import java.io.IOException;

public interface CommonMapper<E, D>{
    E toEntity (D d);
    D toDto (E e) throws IOException;
}
