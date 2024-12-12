package com.CN.HR_Cnkart.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CN.HR_Cnkart.Entity.Item;
import com.CN.HR_Cnkart.Serivces.Itemservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/item")
public class itemcontroller {
     @Autowired
     Itemservice itemservice;
    @GetMapping("id/{id}")
    public Item getItemById(@PathVariable int id) {
       return itemservice.getItemById(id);
        
    }
    @PostMapping("/save")
    public void postMethodName(@RequestBody Item item) {
        //TODO: process POST request
        
      itemservice.itemsave(item);
    }
    @DeleteMapping("delete/item/{item}")
    public void deleteItem(@PathVariable Item item){
      itemservice.deleteitem(item);
    }
    @PutMapping("UPDATE")
    public void putMethodName( @RequestBody Item updateitem) {
        //TODO: process PUT request\\\\\\\\\\\\\
        itemservice.updateitem(updateitem);
        
        
    }
    
    
    

}
