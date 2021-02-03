import java.util.LinkedList;
public class Ex3 {

		public static void main (String[]args) {
			LinkedList<Integer>lista = new LinkedList<Integer>();
			Integer soma = 0;
			
			lista.add(2);
			lista.add(4);
			lista.add(6);
			lista.add(8);
			
			System.out.println("O conteudo na lista eh:" +lista);
			
			for (int contador =0;contador< lista.size();contador++) {
				soma=soma+lista.get(contador);
			}
			System.out.println("A soma do conteudo da lista eh:" +soma);
		}
}
