package com.CN.HR_Cnkart.Serivces;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CN.HR_Cnkart.DAL.ItemRepositary;
 
import com.CN.HR_Cnkart.Entity.Item;

import jakarta.transaction.Transactional;

@Service
public class Itemservice {
      @Autowired
      ItemRepositary itemRepositary;
       @Transactional
    public Item getItemById(int id) {
         
         return itemRepositary.findById(id).get();
    }
    @Transactional
    public void itemsave(Item item){
        itemRepositary.save(item);
    }

    @Transactional
    public void deleteitem(Item item){
        itemRepositary.delete(item);
    }
    @Transactional
    public void updateitem( Item item) {
        // TODO Auto-generated method stub
         itemRepositary.update(item);
    }

}
