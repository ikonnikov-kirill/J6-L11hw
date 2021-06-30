package j6l11.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {

    private int id;

    private String name;
}
