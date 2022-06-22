package orgsid.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import orgsid.inventoryservice.Entities.Product;
import orgsid.inventoryservice.Repositories.ProductRepository;
@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration ){
        return args -> {
            restConfiguration.exposeIdsFor(Product.class);
          productRepository.save(new Product(null,"PC HP",3000,200));
          productRepository.save(new Product(null,"PC DELL",4000,300));
          productRepository.save(new Product(null,"IMPRIMANTE HP ",3100,100));
          productRepository.save(new Product(null,"PC MSI",9000,26));
          productRepository.save(new Product(null,"PHONE SAMSUNG",3200,28));
          productRepository.save(new Product(null,"IMPRIMANTE SAMSUNG",2000,25));
          productRepository.save(new Product(null,"CLAVIER",200,150));
          productRepository.save(new Product(null,"PC LENOVO",6000,52));
          productRepository.save(new Product(null,"PC THINK PADD",3500,20));
        };

    }

}
