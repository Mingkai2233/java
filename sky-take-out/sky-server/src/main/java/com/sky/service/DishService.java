package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.result.Result;

public interface DishService {

    Result<Object> save(DishDTO dishDTO);
}
