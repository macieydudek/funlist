package prv.macieydudek.funlist;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface FunList<T> {

	FunList<T> add(T t);

    FunList<T> remove(T t);

    boolean contains(T t);

    int indexOf(T t);

    void each(Consumer<T> consumer);

    FunList<T> filter(Predicate<T> predicate);

    <S> FunList<S> map(Function<T, S> function);

    static <S> FunList<S> empty(Class<S> sClass) {
        return new EmptyList<S>();
    }
}
