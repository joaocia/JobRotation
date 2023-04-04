
public class inverterString {
	public static void main(String[] args) {

		String entrada = "asse agav é !ahnim";
		StringBuilder resultado = new StringBuilder(entrada.length());

		for (String s : entrada.split(" ")) {
			if (resultado.length() != 0)
				resultado.append(' ');
			for (int x = s.length() - 1; x >= 0; x--) {
				resultado.append(s.charAt(x));
			}
		}
		System.out.println(resultado);
	}
}
