n = int(input())

if n == 0:
    print(0)

count = 0

while n>0:
    n//=10
    count += 1

print(count)

