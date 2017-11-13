import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {

    /**
     * initialize union-find data structure with N objects (0 to N-1)
     * @param n
     */
    public UF(int n) {
	
    }
    
    /**
     * add connection between p and q
     * @param p
     * @param q
     */
    public void union(int p, int q) {
	
    }
    
    /**
     * are p and q in the same component?
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
	return false;
    }
    
    /**
     * component identifier for p (0 to N-1)
     * @param p
     * @return
     */
    public int find(int p) {
	return 0;
    }
    
    /**
     * return the number of components
     * @return
     */
    public int count() {
	return 0;
    }
    
    public static void main(String[] args) {
	int N = StdIn.readInt();
	UF uf = new UF(N);
	while(!StdIn.isEmpty()) 
	{
	    int p = StdIn.readInt();
	    int q = StdIn.readInt();
	    if(!uf.connected(p, q)) 
	    {
		uf.union(p, q);
		StdOut.println(p+ " "+q);
	    }
	}
    }
}
