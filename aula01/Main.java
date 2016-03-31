class Main {
	 public static void main(String[] args) {
	 	//QUESTAO 04
	 	Pessoa p1 = new Pessoa();
	 	p1.setNome("Ana");
	 	p1.setIdade(18);
	 	Pessoa p2 = new Pessoa();
        p2.setNome("Joao");
        p2.setIdade(22); 

	 	//QUESTAO 07
	 /*	
	 	Pessoa p1 = new Pessoa("Ana",18);	
	 	Pessoa p2 = new Pessoa("Joao",22);
       */ 

	 /*	//QUESTAO 09
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        Pessoa p2 = new Pessoa();
        p2.setNome("Joao");

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        p1 = p2; 
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
	 
	 */

	 /*	
	 	System.out.println("Nome 1: "+p1.getNome());
	 	System.out.println("Idade 1: "+p1.getIdade());
	 	System.out.println("Nome 2:"+p2.getNome());
        System.out.println("Idade 2: "+p2.getIdade()); */

       //QUESTAO 10
        p1.Display();
        p2.Display();
         

        

	 }
		
	}
