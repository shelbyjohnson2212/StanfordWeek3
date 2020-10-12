
public class Rational {
	int x;
	int y;
	Rational(int x, int y){
		this.x = x;
		this.y = y;
	}
	
public void run() {
	Rational r = new Rational(1, 2);
	r = raiseToPower(r, 3);
	System.out.println("r ^ 3 = " + r);
}

public Rational raiseToPower(Rational x, int n) {
	Rational result = new Rational(1, n);
	for (int i = 0; i < n; i++) {
		result = result.multiply(x);
	}
	return result;
}

private Rational multiply(Rational x2) {
	// TODO Auto-generated method stub
	return null;
	
}
 
}

