
public class QuickUnionUF {
    private int[] id;
    
    /**
     * initially all the objects point to itself
     * @param N
     */
    public QuickUnionUF(int N) {
	id = new int[N];
	for (int i = 0; i < N; i++) {
	    id[i] = i;
	}
    }
    
    /**
     * chase parent pointers until reach root (depth of i array accesses)
     * @param i
     * @return
     */
    private int root(int i) {
	while (i !=id[i])
	    i = id[i];
	
	return i;
    }
    
    /**
     * check if p and q have same root (depth of p an q array accesses)
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q) {
	return root(p) == root(q);
    }
    
    /**
     * change root of p to point to root of q (depth of p an q array accesses)
     * @param p
     * @param q
     */
    public void union(int p, int q) {
	int i = root(p);
	int j = root(q);
	id[i] = j;
    }
    
    public static void main(String[] args) {
	
    }
}
