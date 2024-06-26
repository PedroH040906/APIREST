package pedro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedro.api.food.Food;
import pedro.api.food.FoodRepository;
import pedro.api.food.FoodRequestDTO;
import pedro.api.food.FoodResponseDTO;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
    Food foodData = new Food(data);
    repository.save(foodData);
    return;
    }
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
