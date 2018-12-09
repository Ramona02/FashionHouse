package com.fashionhouse.repository;

import com.fashionhouse.entities.Clothes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
@Component
public interface ClothesRepository extends CrudRepository<Clothes,Long> {

}
