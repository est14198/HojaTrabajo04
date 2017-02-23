
public class FactoryPilas {
	public FactoryPilas(){
	}
	
	public iPila<Double> getPila(int tipoPila){
		switch(tipoPila){
		case 0:
			return new PilaArrayList<Double>();
		case 1:
			return new PilaVector<Double>(2);
		case 2:
			return new PilaLista<Double>();
		default:
			return null;
		}
		
	}
}
