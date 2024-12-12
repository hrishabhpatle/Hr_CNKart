package com.CN.HR_Cnkart.DAL;

import org.springframework.data.repository.CrudRepository;

import com.CN.HR_Cnkart.Entity.Item;

public interface ItemRepositary extends CrudRepository<Item,Integer> {

    void update(Item item);

}
