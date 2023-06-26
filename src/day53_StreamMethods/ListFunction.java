package day53_StreamMethods;

import java.util.List;

public interface ListFunction<T, R> {

    R apply(List<T> list);


}
