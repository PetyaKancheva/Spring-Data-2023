package bg.softuni.AdvancedQuerying.repository;

import bg.softuni.AdvancedQuerying.entities.Ingredient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository  extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findByNameStartingWith (String letter);

    List<Ingredient> findByNameInOrderByPrice( List<String> names);

    @Override
    void delete(Ingredient entity);
    @Modifying
    @Transactional
    @Query ("UPDATE Ingredient as i " +
            "SET i.price = i.price * 1.1")
    void   increasePriceBy10Percent();


}
