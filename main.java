package teste;

public class main {

	public static void main(String[] args) {
		    int[] v = new int[10]; 
		    v[0] = 5;
		    System.out.println(v[0]);
		    
		    int arranjo1[] = new int[10];
			
		    arranjo1[0] = 3;
			System.out.println(arranjo1[0]);
			
			//Arranjos podem ser criados com a especificação de conteúdo:
			int arranjo2[] = {2, 4, 5, 7, 10, 11, 13, 15};
			
			System.out.println("tamanho do arranjo2: " + arranjo2.length);
				
			char arranjoCar[];
			arranjoCar= new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
			
			String cordao;
			cordao= new String(arranjoCar);
			System.out.println(cordao);
			
			System.out.println(arranjoCar[6]);
			System.out.println(cordao.charAt(1));
	}

}