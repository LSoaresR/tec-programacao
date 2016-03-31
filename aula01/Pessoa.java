class Pessoa {
	String nome;
	int idade;

  //QUESTAO 07
	/*
	Pessoa(String nome,int idade) {
       setNome(nome);
       setIdade(idade);
	} */
    
    void Display() {
    	System.out.println("NOME:"+getNome()+", "+"IDADE:"+getIdade());

    }
	void setNome(String nome) {
       this.nome = nome;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	String getNome() {
		return nome;
	}

	int getIdade() {
		return idade;
	}
}