package com.calc;

class Fraction {

    private int num;
    private int denom;

    Fraction() {
        this.num = 1;
        this.denom = 1;
    }

    Fraction(int num, int denom) throws Exception {
        if (denom == 0) {
            throw new Exception("/ by zero");
        } else {
            this.num = num;
            this.denom = denom;
        }
    }

    String getValue() {
        String value;
        int gcd = greatestCommonDivisor(this.num, this.denom);
        this.num /= gcd;
        this.denom /= gcd;
        if (this.denom == 1) {
            value = this.num + "";
        } else if (this.num == this.denom) {
            value = "1";
        } else if (this.num == 0) {
            value = "0";
        } else if (this.denom < 0) {
            value = (this.num * -1) + "/" + (this.denom * -1);
        } else {
            value = this.num + "/" + this.denom;
        }
        return value;
    }

    void setValue() {
        this.num = 1;
        this.denom = 1;
    }

    void setValue(int num, int denom) throws Exception {
        if (denom == 0) {
            throw new Exception("/ by zero");
        } else {
            this.num = num;
            this.denom = denom;
        }
    }

    private int greatestCommonDivisor(int first, int second) {
        int gcd = 1;
        boolean flag = false;
        for (int i = 2; i <= Math.abs(first); i++) {
            if ((Math.abs(first) % i == 0) && (Math.abs(second) % i == 0)) {
                flag = true;
                gcd = i;
            }
        }
        if (flag) return gcd;
        else return 1;
    }

    void summation(Fraction summand) {
        this.num = this.num * summand.denom + summand.num * this.denom;
        this.denom *= summand.denom;
    }

    void summation(Fraction first, Fraction second) {
        this.num = first.num * second.denom + second.num * first.denom;
        this.denom = first.denom * second.denom;
    }

    void substraction(Fraction deductible) {
        this.num = this.num * deductible.denom - deductible.num * this.denom;
        this.denom *= deductible.denom;
    }

    void substraction(Fraction first, Fraction second) {
        this.num = first.num * second.denom - second.num * first.denom;
        this.denom = first.denom * second.denom;
    }

    void multiplication(Fraction multiplier) {
        this.num *= multiplier.num;
        this.denom *= multiplier.denom;
    }

    void multiplication(Fraction first, Fraction second) {
        this.num = first.num * second.num;
        this.denom = first.denom * second.denom;
    }

    void division(Fraction divisible) throws Exception {
        if (divisible.num == 0) {
            throw new Exception("/ by zero");
        } else {
            this.num *= divisible.denom;
            this.denom *= divisible.num;
        }
    }

    void division(Fraction first, Fraction second) throws Exception {
        if (second.num == 0) {
            throw new Exception("/ by zero");
        } else {
            this.num = first.num * second.denom;
            this.denom = first.denom * second.num;
        }
    }
}
