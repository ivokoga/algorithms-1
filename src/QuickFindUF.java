
public class QuickFindUF {

    private int[] id;
    
    public QuickFindUF(int N) {
	id = new int[N];
	for (int i = 0; i < N; i++) {
	    id[i] = i;
	}
    }
    
    public boolean connected(int p, int q)
    {
	return id[p] == id[q];
    }
    
    /**
     * Union operation too expensive nˆ2
     * @param p
     * @param q
     */
    public void union(int p, int q)
    {
	int pid = id[p];
	int qid = id[q];
	//itera pelo array e verifica os índices que possuem valor de p. Caso seja igual a p, troca para o valor de q
	// de forma que todos os valores p e que fiquem iguais.
	//neste caso todos valores serão iguais a q no final
	for (int i = 0; i < id.length; i++) {
	    if(id[i] == pid)
		id[i] = qid;
	}
    }
}
