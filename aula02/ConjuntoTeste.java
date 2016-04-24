
public class ConjuntoTeste {
	
	    static final int MAX = 10;
	    
	    private Object matrix[][];
	    private Object elementos[];
	    private boolean vazio = true;
	    private int ordem;
	  
		
	  //METODOS DO CODIGO PRINCIPAL
	    public ConjuntoTeste(){
	       this.vazio = true;
	    }


	    //Construtor que recebe um conjunto já predefinido
	    public ConjuntoTeste(Object elementos[]) {
	        this.elementos = elementos;
	        this.vazio = false;
	    }


	    //Criar conjunto. com tamanho passado por parametro
	    public ConjuntoTeste(int tam) {
	        this.elementos = new Object[tam];
	    }
	    
	    //Criar uma matrix no conjunto
	    public ConjuntoTeste(int a, int b) {
	    	this.matrix = new Object[a][b];
	    }
	    

	    public void insercao(Object a) {
	        this.elementos[ordem] = a;
	        this.ordem++;
	        this.vazio = false;
	            
	     }
	    
	    public void inserir_matrix(Object a, Object b) {
	    	this.matrix[ordem][0] = a ;
	    	this.matrix[ordem][1] = b;
	    	this.ordem++;
	    	this.vazio = false;
	    }
	    //Pertinencia de um elemento a um conjunto
	    public boolean pertinencia(int a) {
	      for (int i = 0; i < this.elementos.length ;i++ ) {
	        if (this.elementos[i].equals(a)) 
	            return true;                 
	       }

	       return false;
	    }

	    //Pertinencia de um conjunto em outro conjunto

	    public boolean pertinencia_conjunto(ConjuntoTeste conj) {
	      return true;
	    }
	   
	    public boolean subconjunto(ConjuntoTeste conj){
	      boolean verificador = false;
	      int ver = 0;
	      for(int i = 0; i < conj.elementos.length; i++) {
	        for (int j = 0; j < elementos.length ;j++) {
	         if (conj.elementos[i].equals(0) == false) {
	             
	          if(conj.elementos[i] == this.elementos[j] && ver == 0) {
	              verificador = true;
	              ver = 1;
	          }

	          else if (ver == 0) {
	              verificador = false;  
	           }
	          }
	        }
	        ver = 0;
	      }
	      
	      return verificador;

	    } 


	    //Como passar um vetor maior do que o definido
	   public ConjuntoTeste uniao(ConjuntoTeste conj) {
	 
	    //1ª parte
	      boolean verificador = true;
	      int cont = 0; 
	    for (int i = 0;i < conj.elementos.length ;i++ ) {
	      for (int j = 0;j < elementos.length ;j++ ) {
	        if (conj.elementos[i] == elementos[j]) {
	           verificador =  false;
	        }
	      }
	      if (verificador) {
	        cont++;
	      }
	      verificador = true;
	    }

	    cont = cont + elementos.length;

	    ConjuntoTeste uni = new ConjuntoTeste(cont);
	    
	    //2ª parte

	      for (int i = 0;i < conj.elementos.length ;i++ ) {
	       for (int j = 0;j < elementos.length ;j++ ) {
	         if (conj.elementos[i] == elementos[j]) {
	            verificador =  false;
	         }
	       }
	       if (verificador) {
	         uni.insercao(conj.elementos[i] ) ;
	       }
	       verificador = true;
	     } 
	     
	     for (int i = 0 ; i < elementos.length ;i++ ) {
	         uni.insercao(elementos[i]);   
	     }
	     
	    return uni;

	   }


	   
	   public ConjuntoTeste interseccao(ConjuntoTeste conj){
	    
		   //algoritmo extremamente ruim, utilizado dos lacos for com O(n^2)
		
	    //contador para saber quantos elementos tem insercao
		   int cont = 0;
		   
		for(int i = 0; i < conj.elementos.length; i++) {
			for(int j = 0 ; j < elementos.length; j++) {
				if(conj.elementos[i] == this.elementos[j] && conj.elementos[i].equals(0) == false) {
					cont++;
				}
			}
		}
	   ConjuntoTeste inter = new ConjuntoTeste(cont);
		
	    for (int i = 0; i < conj.elementos.length;i++ ) {
	      for (int j = 0; j < elementos.length;j++ ) {
	        if(conj.elementos[i] == this.elementos[j] && conj.elementos[i].equals(0) == false) {
	          inter.insercao(conj.elementos[i]);
	        }
	        
	      }
	    }

	    return inter;

	   }
	    

	    //conj = B e objeto da instancia seŕa A
	    public ConjuntoTeste diferenca(ConjuntoTeste conj) {

	      ConjuntoTeste dif = new ConjuntoTeste(elementos.length-conj.elementos.length);
	      boolean verificador = false;
	      for (int i = 0 ;i < elementos.length ;i++ ) {
	        for (int j = 0;j < conj.elementos.length ;j++ ) {
	          if(elementos[i] == conj.elementos[j] && verificador == false ) {
	            verificador = true;
	          }
	        }
	      if(!verificador) {
	        dif.insercao(elementos[i]);
	      }
	      verificador = false; 
	      }

	      return dif;
	   
	    }

	  
	   //METODOS PARALELOS

	    public void Print() {
	      for(int i=0; i < elementos.length; i++)  
	        System.out.println(elementos[i]);
	    } 
	    
	    public void Print_Matrix() {
	    	int j = 0;
	    	for(int i = 0; i < this.ordem; i++) {
	    			
	    	System.out.println("{"+matrix[i][j]+", "+matrix[i][j+1]+"}");
	    	j = 0;
	    			
	    	}
	    }

	    public boolean getVazio() {
	      return this.vazio;
	    }
	    
	    
	    // QUESTAO 04
	    //Primeiro teste apenas imprimindo o valor
	    public void pro_cartesiano(ConjuntoTeste conj) {
	    	//Conjunto cart = new Conjunto();
	    	for(int i = 0; i < elementos.length; i++) {
	    		for(int j = 0; j < conj.elementos.length;j++) {
	    			System.out.println("{"+elementos[i]+", "+conj.elementos[j]+"} ");
	    		}
	    	}
	    
	    }
	    
	      //Fazer pro_cartesiano passando os valores como conjunto
	    
	   public ConjuntoTeste produto_cartesiano(ConjuntoTeste conj) {
	    	
	    	int tam = elementos.length*conj.elementos.length;
	    	ConjuntoTeste c3 = new ConjuntoTeste(tam, tam);
	    	
	    	for(int i = 0; i < elementos.length; i++ ) {
	    		for(int j = 0; j < conj.elementos.length; j++) {
	    		    c3.inserir_matrix(elementos[i], conj.elementos[j]);
	    		}
	    	}
	    	
	    	
	    	return c3;
	    	 
	    }

	  /*  public ConjuntoTeste conjuntoPotencia(ConjuntoTeste conj) {
          int n = elementos.length;
          int tam = (int)Math.pow(2,elementos.length);
          ConjuntoTeste pot = new ConjuntoTeste(tam);
          int now = 0;

          while( n != 0) {
             
             for (int i = 0;i < elementos.length ;i++ ) {

             	pot.elementos[now] = elementos[i];

              	
              } 

          }
	    	
          return pot;

	    }
	   */

	}


