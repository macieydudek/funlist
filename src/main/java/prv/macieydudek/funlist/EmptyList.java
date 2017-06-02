package prv.macieydudek.funlist;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmptyList<T> implements FunList<T> {

    @Override
    public FunList<T> add(T t) {
        return new NonEmptyFunList<T>(t);
    }

	public FunList<T> remove(T t) {
		throw new EmptyListException();
	}

	public boolean contains(T t) {
		return false;
	}

	public int indexOf(T t) {
		return -2;
	}

	public void each(Consumer<T> consumer) {
		// TODO Auto-generated method stub
		
	}

	public FunList<T> filter(Predicate<T> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S> FunList<S> map(Function<T, S> function) {
		// TODO Auto-generated method stub
		return null;
	}

}
