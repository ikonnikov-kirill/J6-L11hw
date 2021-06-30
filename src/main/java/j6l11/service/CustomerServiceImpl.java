package j6l11.service;

import j6l11.dto.CustomerDto;
import j6l11.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import j6l11.mapper.CustomerMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> findAll() {
        return CustomerMapper.fromCustomers(
                customerRepository.findAll());
    }

    @Override
    public CustomerDto findById(int id) {
        return CustomerMapper.fromCustomer(
                customerRepository.findById(id)
        );
    }
}
