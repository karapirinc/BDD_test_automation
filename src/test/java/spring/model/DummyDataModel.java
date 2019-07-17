package spring.model;

import lombok.*;
import spring.DummySingleton;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DummyDataModel {

    private int value;
    private DummySingleton dummySingleton;
}
