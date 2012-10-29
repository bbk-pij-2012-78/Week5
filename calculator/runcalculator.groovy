int num1 = 1;
int num2 = 2;
intFunction = 0;
Calculator calc = new Calculator();

print('Enter the first number: ')
num1 = Integer.parseInt(System.console().readLine())

print('Enter the second number: ')
num2 = Integer.parseInt(System.console().readLine())

println('1. Add')
println('2. Subtract')
println('3. Multiply')
println('4. Divide')
println('5. Modulus')
print('Choose the calculation:')
intFunction = Integer.parseInt(System.console().readLine())

switch (intFunction) {
	case 1:
		println(calc.add(num1, num2));
		break;
	case 2:
		println(calc.subtract(num1, num2));
		break;
	case 3:
		println(calc.multiply(num1, num2));
		break;
	case 4:
		println(calc.divide(num1, num2));
		break;
	case 5:
		println(calc.modulus(num1, num2));
}