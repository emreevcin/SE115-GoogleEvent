package Week_12;

/*
A polynomial of degree n is of the form a0 + a1x + a2x2+... + anxn, where a0, a1,...an are real numbers, and n is a non-negative integer.
a) Define a class for polynomial;
b) Provide constructor method(s)
c) Provide a method for returning the degree of the polynomial
d) Provide a method for adding a second polynomial to a polynomial object
e) Provide a method for multiplying a second polynomial to a polynomial object
 */

public class Question5 {
    public static void main(String[] args) {
        Polynomial poly1 = new Polynomial(2);
        poly1.setCoefficient(2, 3);
        poly1.setCoefficient(1, 2);

        Polynomial poly2 = new Polynomial(1);
        poly2.setCoefficient(1, 5);
        poly2.setCoefficient(0, 4);

        System.out.println("Degree of poly1: " + poly1.getDegree());
        System.out.println("Degree of poly2: " + poly2.getDegree());

        poly1.addPolynomial(poly2);
        System.out.println("After addition: Degree of poly1: " + poly1.getDegree());

        poly2.multiplyPolynomial(poly1);
        System.out.println("After multiplication: Degree of poly2: " + poly2.getDegree());
    }
}


class Polynomial {
    private double[] coefficients;
    private int degree;

    public Polynomial(int degree) {
        this.coefficients = new double[degree + 1];
        this.degree = degree;
    }

    public int getDegree() {
        return degree;
    }

    public void setCoefficient(int power, double coefficient) {
        if (power >= 0 && power <= degree) {
            coefficients[power] = coefficient;
        }
    }

    public void addPolynomial(Polynomial polynomial) {
        int maxDegree = Math.max(this.degree, polynomial.degree);
        double[] resultCoefficients = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            if (i <= this.degree) {
                resultCoefficients[i] += this.coefficients[i];
            }
            if (i <= polynomial.degree) {
                resultCoefficients[i] += polynomial.coefficients[i];
            }
        }

        this.coefficients = resultCoefficients;
        this.degree = maxDegree;
    }

    public void multiplyPolynomial(Polynomial polynomial) {
        int resultDegree = this.degree + polynomial.degree;
        double[] resultCoefficients = new double[resultDegree + 1];

        for (int i = 0; i <= this.degree; i++) {
            for (int j = 0; j <= polynomial.degree; j++) {
                resultCoefficients[i + j] += this.coefficients[i] * polynomial.coefficients[j];
            }
        }

        this.coefficients = resultCoefficients;
        this.degree = resultDegree;
    }
}
