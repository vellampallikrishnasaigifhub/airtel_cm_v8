#find even or odd
num = lambda a:a%2==0
print(num(4))
#find positive or negitive
def number(a):
    if a>0:
        print(a,"positive number")
    elif a==0:
        print(a,"zero")
    else:
        print(a,"negitive number")
number(7893)
number(-467)
number(0)