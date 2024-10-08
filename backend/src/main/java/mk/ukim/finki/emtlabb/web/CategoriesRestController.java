package mk.ukim.finki.emtlabb.web;

import mk.ukim.finki.emtlabb.model.enumerations.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
@RequestMapping("/api/categories")
public class CategoriesRestController {

    @GetMapping()
    public List<Category> listCategories() {
        return Arrays.asList(Category.values());
    }
}
