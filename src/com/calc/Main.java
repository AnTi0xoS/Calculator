package com.calc;

public class Main {

    public static void main(String[] args) throws Exception {

        Fraction a = new Fraction(3, 4);    // создание экземпляра с 2-умя аргументами
        Fraction b = new Fraction();                   // создание экземпляра без аргументов, по умолчанию 1/1
        Fraction c = new Fraction(5, 1);
        Fraction d = new Fraction(7, 7);
        Fraction e = new Fraction(0, 11);
        Fraction f = new Fraction(8, -9);

        System.out.println(a.getValue());
        System.out.println(b.getValue());
        System.out.println(c.getValue());
        System.out.println(d.getValue());
        System.out.println(e.getValue());
        System.out.println(f.getValue());
        System.out.println();

        // Сложение

        Fraction first = new Fraction(-3, 4);
        Fraction second = new Fraction(7,6);
        Fraction result = new Fraction();
        System.out.println("Сложение");

        result.summation(first, second);
        System.out.println(result.getValue());

        first.summation(second);
        System.out.println(first.getValue());

        System.out.println();

        // Вычитание

        first.setValue(13, 15);
        second.setValue(3, 15);
        result.setValue();
        System.out.println("Вычитание");

        result.substraction(first, second);
        System.out.println(result.getValue());

        first.substraction(second);
        System.out.println(first.getValue());

        System.out.println();

        // Умножение

        first.setValue(-3, 4);
        second.setValue(5, 6);
        result.setValue();
        System.out.println("Умножение");

        result.multiplication(first, second);
        System.out.println(result.getValue());

        first.multiplication(second);
        System.out.println(first.getValue());

        System.out.println();

        // Деление

        first.setValue(7, 6);
        second.setValue(14, 3);
        result.setValue();
        System.out.println("Деление");

        result.division(first, second);
        System.out.println(result.getValue());

        first.division(second);
        System.out.println(first.getValue());
    }
}
