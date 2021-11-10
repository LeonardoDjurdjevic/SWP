
class BinarySearch {
	
	public static int counter = 0;
	
    int binarySearch(int arr[], int x) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x) {
            	System.out.println();
            	System.out.println("gefunden nach " + counter + " Schritten");
                return mid;
            }    

            if (arr[mid] < x) {
            	counter++;
            	System.out.println("groesser | Schritt: " + counter);
                lo = mid + 1;
            }    
  
            else {
            	counter++;
            	System.out.println("kleiner  | Schritt " + counter);
                hi = mid - 1;
            }    
        }
        return -1;
    }
    
    public static int[] createArray(int laenge) {
    	int ar[] = new int[laenge];
   
    	for(int i = 0; i < ar.length; i++) {
    		ar[i] = i + 1;
    	}
    	return ar;
    }
    
    
    public static void ausgabe(int[] ar2) {
    	for(int i = 0; i < ar2.length; i++) {
    		System.out.print(ar2[i] + " ");
    	}
    	System.out.println();
    	System.out.println();
    }
    

    public static void main(String args[]) {			// Static bedeutet, dass es auf die Klasse und nicht auf das Objekt referenziert
        BinarySearch ob = new BinarySearch();
        
        int arr[] = createArray(50);
        BinarySearch.ausgabe(arr);
        int x = 5;
        int position = ob.binarySearch(arr, x);
        if (position == -1)
            System.out.println("Kein Element gefunden");
        else
            System.out.println("Gefundenes Element: " + position);
    }
    
}