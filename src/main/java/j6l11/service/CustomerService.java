package j6l11.service;

import j6l11.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> findAll();

    CustomerDto findById(int id);

}
