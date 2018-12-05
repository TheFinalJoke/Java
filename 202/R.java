/* Nick Shorter
 *
 **/

public class R {
	public static int r(int n){
		if (n<=1)
			return n;
		else if (n>1 && n%2 == 0)
			return n + r(n/2);
			else
				return r((n+1)/2)+ r((n-1)/2);
	}
}