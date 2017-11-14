import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    boolean[][] grid;
    
    // create n-by-n grid, with all sites blocked
   public Percolation(int n) {
       grid = new boolean[n][n];
//	for (int i = 0; i < N; i++) {
//	    id[i] = i;
//	}
   }
// open site (row, col) if it is not open already
   public    void open(int row, int col) {
       
   }
// is site (row, col) open?
   public boolean isOpen(int row, int col) {
       return grid[row][col];
   }
   
// is site (row, col) full?
   public boolean isFull(int row, int col) {
       return false;
   }// number of open sites
   public     int numberOfOpenSites() {
       return 0;
   }
// does the system percolate?
   public boolean percolates() {
       return false;
   }

   public static void main(String[] args)   // test client (optional)
   {
       
   }
}