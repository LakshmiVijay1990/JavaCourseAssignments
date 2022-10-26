
public class Assignment1 {
	

	public static void main(String[] args) {
		
		//Write a program(WAP) to print INEURON using pattern programming logic.
		int n=10;
		System.out.println("Question 1 ");
		System.out.println("---------------------------------\n");
		//Printing name LAKSHMI
		for(int i=0;i<n;i++) {
			//Printing L
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			//Printing A
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0) || (i==(n-1)/2 && j<n-1) || (j==(n-1) && i!=0 ) || (i==0 && j!=0 && j<(n-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//Printing K
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==j && j>=(n-1)/2) || (i+j==n-1 &&  i<(n-1)/2) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//Printing S
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( (i==0 && j!=0 && j!=-n-1) || (i==(n-1)/2 && j!=0 && j!=(n-1))  ||
						 ( i==n-1  && j!=n-1 && j!=0) || (j==0 && i<=(n-1)/2 && i!=0 && i!=(n-1)/2 && j!=n-1) || 
						       (j==n-1 && i>(n-1)/2) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//Printing H
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( (j==0 )|| j==n-1 || i==(n-1)/2 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//Printing M
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( (j==0 )|| j==n-1 || (i==j && i<=(n-1)/2) || (i+j==n-1 && i<=(n-1)/2) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Printing I
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2 || i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		//Printing INEURON
		for(int i=0;i<n;i++) {
			//Printing I
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2 || i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			//Printing N
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//Printing E
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || (i==(n-1)/2 && j<n/2 ) || j==0  ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//Printing U
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( (i==n-1 && j!=0 && j!=n-1) || (j==0 && i!=n-1) || (j==n-1 && i!=n-1) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Printing R
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if( (j==0 ) || (i==0 && j!=n-1 && j!=0) || (i==(n-1)/2 && j!=n-1 && j!=0) ||
						(j==n-1 && i!=0 && i<(n-1)/2) || (i==j && j>(n-1)/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Printing O
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(  (i==0 && j!=0 && j!=n-1)  || (i==n-1 && j!=0 && j!=n-1) ||
						(j==0 && i!=0 && i!=n-1) || (j==n-1 && i!=0 && i!=n-1)  ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Printing N
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/* Question 2 ****************************************************** */
		System.out.println();
		System.out.println("Question 2\n");
		
		n=4;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n----------------------------------------------------\n");
		/* Question 3 ************************ */
		System.out.println("\nQuestion 3\n");
		
		n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0  || j==n-1  || (i+j<=(n-1)/2 && j<n-1/2 ) || (j-i>=(n-1)/2 && j>(n-1)/2)  )
				{
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println("\n----------------------------------------------------\n");
		/* Question 4 ************************ */
		System.out.println("\nQuestion 4\n");

		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n-1 || i==n-2 ||  ( (i-j) >(n-1)/2 && j<=(n)/2) || ((i+j)>=n+(n-1)/2 && i>((3*n/4)-1)/2 &&  j>=(n)/2)  )
				//if(i==3*n/4 || ( (i-j) >((3*n/4)-1)/2 && j<((3*n/4)-1)/2) || ((i+j)>=(3*n/4)+((3*n/4)-1)/2 && i>((3*n/4)-1)/2 &&  j>((3*n/4)-1)/2)  )
				{
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("\n----------------------------------------------------\n");
		/* Question 5 ************************ */
		System.out.println("\nQuestion 5\n");
		
		n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || ( j<=(n-1)/2 && i+j<=(n-1)/2)  || ( j<=(n-1)/2) && i-j>=(n-1)/2 )
				{
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
