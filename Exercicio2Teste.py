

def fibonacci(n):
    a, b = 0, 1
    while b < n:
        a, b = b, a+b
    return a == n or b == n

print("=====================================================")
x = int(input("Informe um número: "))
print("=====================================================")
if fibonacci(x):
    print(f"O número [{x}] pertence à sequência de Fibonacci.")
else:
    print(f"O número [{x}] não pertence à sequência de Fibonacci.")
print("=====================================================")






