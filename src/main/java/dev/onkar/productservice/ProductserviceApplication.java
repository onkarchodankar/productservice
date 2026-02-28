package dev.onkar.productservice;

import dev.onkar.productservice.inheritancedemo.joinedtable.MentorRepository;
import dev.onkar.productservice.inheritancedemo.joinedtable.UserRepository;
import dev.onkar.productservice.models.Category;
import dev.onkar.productservice.models.Price;
import dev.onkar.productservice.models.Product;
import dev.onkar.productservice.repositories.CategoryRepository;
import dev.onkar.productservice.repositories.PriceRepository;
import dev.onkar.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {
    private MentorRepository mentorRepository;
    private UserRepository userRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final PriceRepository priceRepository;

    public  ProductserviceApplication(@Qualifier("jt_mr") MentorRepository mentorRepository,
                                          @Qualifier("jt_ur") UserRepository userRepository,
                                      ProductRepository productRepository,
                                      CategoryRepository categoryRepository,
                                      PriceRepository priceRepository) {
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.priceRepository = priceRepository;

    }
    public static void main(String[] args) {
        SpringApplication.run(ProductserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("Naman");
//        mentor.setEmail("Naman@scaler.com");
//        mentor.setAverageRating(4.65);
//        mentorRepository.save(mentor);
//
//        User user = new User();
//        user.setName("Sarath");
//        user.setEmail("sarathcool@yopmail.com");
//        userRepository.save(user);
//
//        List<User>  users = userRepository.findAll();
//        for(User user1:users){
//            System.out.println(user1);
//        }

        Category category = new Category();
        category.setName("Apple Devices");
//       Category saveCategory = categoryRepository.save(category);

        Price price = new Price("Rupees",10);
 //       Price savedPrice = priceRepository.save(price);

        Product product = new Product();
        product.setTitle("iPhone 15 Pro");
        product.setDescription("The best iPhone Ever");
        product.setCategory(category);
        product.setPrice(price);

         productRepository.save(product);
         productRepository.deleteById(UUID.fromString("009d864e-e845-47e4-b1b4-057b9252c2eb"));
//        Category category1 = categoryRepository.findById(UUID.fromString("1d0b1a88-7410-41d1-bb88-4bd04805178b")).get();
//        System.out.println("Category name is:" + category1.getName());
//        System.out.println("Printing all products in the category");
//        Thread.sleep(1000);
//
//        category1.getProducts().forEach(
//                product1 ->  System.out.println(product1.getTitle())
//        );
//                for(Product product1: category1.getProducts()){
//          try {
//              System.out.println(product1.getTitle());
//          } catch (Exception e) {
//              System.out.println(e.getMessage());
//          }
//        }

    }


}
