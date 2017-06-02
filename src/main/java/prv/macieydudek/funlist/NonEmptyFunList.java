package prv.macieydudek.funlist;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NonEmptyFunList<T> implements FunList<T> {

	private final T head;
    private final FunList<T> tail;

    public NonEmptyFunList(T t) {
        head = t;
        tail = new EmptyList<>();
    }

    public NonEmptyFunList(T t, FunList<T> tail) {
        this.head = t;
        this.tail = tail;
    }
	
    @Override
    public FunList<T> add(T t) {
        return new NonEmptyFunList<T>(head, tail.add(t));
    }

	@Override
	public FunList<T> remove(T t) {
		if(this.head.equals(t)){
			return this.tail;
		} 
		return new NonEmptyFunList<T>(head, tail.remove(t));			
	}

	@Override
	public boolean contains(T t) {
		return head.equals(t) || tail.contains(t);
	}

	@Override
	public int indexOf(T t) {
		if(this.head.equals(t)) {
			return 0;
		}
		return 1 + tail.indexOf(t);
	}

	@Override
	public void each(Consumer<T> consumer) {
		// TODO Auto-generated method stub
	}

	@Override
	public FunList<T> filter(Predicate<T> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S> FunList<S> map(Function<T,S> function) {
		// TODO Auto-generated method stub
		return null;
	}

}
