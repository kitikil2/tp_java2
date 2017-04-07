package pratique;

public class FigureGeometrique extends Segment {
	private Segment cote;
	private Segment autrec;
	
	public FigureGeometrique(){
		//constructeur par defaut
	}
	public FigureGeometrique(Segment cote){
		//carre
		this.cote=cote;
	}
	public FigureGeometrique(Segment cote, Segment autrec){
		//rectangle
		this.cote=cote;
		this.autrec=autrec;
	}

}
