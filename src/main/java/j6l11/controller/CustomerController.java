package j6l11.controller;

import j6l11.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import j6l11.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
@Slf4j
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping()
    public List<CustomerDto> showProducts() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public CustomerDto showProduct(@PathVariable("id") int id) {
        return customerService.findById(id);
    }

}
