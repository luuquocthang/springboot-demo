package fpt.com.vn.training.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ActiveEnum {
    IN_ACTIVE(0, "in-active"),
    ACTIVE(1,"active");

    private int type;
    private String value;
}
