package fpt.com.vn.training.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MessageDto {

    private String code;

    private String message;

    private String cause;

    private String key;

    private String param;
}