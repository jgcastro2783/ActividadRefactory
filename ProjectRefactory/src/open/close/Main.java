package open.close;

public class Main {
	public static void tocarNotas(Instrumento instrumento, int n) {
        for (int i = 0; i < n; i++) {
            instrumento.tocar();
        }
    }

    public static void tocarSinfonia() {
        Instrumento guitarra = new Guitar();
        Instrumento piano = new Piano();
        Instrumento tambor = new Drum();
        int[] notas = new int[]{2, 3, 4};
        
        for (int i = 0; i < notas.length; i++) {
            tocarNotas(guitarra, notas[i]);
            tocarNotas(piano, notas[i]);
            tocarNotas(tambor, notas[i]);
        }
    }
	
	public static void main(String[] args) {
		tocarSinfonia();

	}

}
