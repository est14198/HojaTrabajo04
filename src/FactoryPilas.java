
public class FactoryPilas<E> {
	public FactoryPilas(){
	}
	
	public iPila<E> getPila(int tipoPila, int tipoLista){
		switch(tipoPila){
		case 0:
			return new PilaArrayList<E>();
		case 1:
			return new PilaVector<E>(2);
		case 2:
			return new PilaLista<E>(tipoLista);
		default:
			return null;
		}
	}
}
