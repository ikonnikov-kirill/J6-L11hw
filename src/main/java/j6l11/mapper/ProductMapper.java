package j6l11.mapper;

import j6l11.dto.ProductDto;
import j6l11.model.Product;
import j6l11.model.Price;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public static Product toProduct(ProductDto productDto) {

        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .price(Price.builder()
                        .cost(productDto.getPrice())
                        .date(new Date())
                        .build())
                .build();
    }

    public static ProductDto fromProduct(Product product) {

        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice().getCost())
                .build();
    }

    public static List<Product> toProducts(List<ProductDto> productDtoList) {
        return productDtoList.stream()
                .map(ProductMapper::toProduct)
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }

    public static List<ProductDto> fromProducts(List<Product> productList) {
        return productList.stream()
                .map(ProductMapper::fromProduct)
                .sorted(Comparator.comparing(ProductDto::getName))
                .collect(Collectors.toList());
    }

}

