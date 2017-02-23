
public class PilaLista<E> implements iPila<E> {

	protected iLista<E> data;
	
	public PilaLista(int tipoLista){
		FactoryListas<E> factoryListas = new FactoryListas<E>();
		data = factoryListas.getLista(tipoLista);
	}

	@Override
	public E pop() {
		return data.removeLast();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public void push(E algo) {
		data.addLast(algo);
	}

}
