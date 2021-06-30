package j6l11.service;

import j6l11.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();

    ProductDto findById(int id);

    ProductDto save(ProductDto productDto);

    void delete(int id);
}
