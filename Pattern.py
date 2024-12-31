
def Pattern1(n):
    for i in range(n):
        for j in range(i+1):
            print("*",end=" ")
        print()

        
def Pattern2(n):
    for i in range(n):
        for j in range(n):
            print("*",end=" ")
        print()

def Pattern3(n):
    for i in range(n):
        for k in range(n-i-1):
            print(" ",end=" ")

        for j in range(i):
            print("*",end=" ")

        print()


def Pattern4(n):
    for i in range(n):
        for k in range(n-i):
            print(" ",end=" ")

        for j in range(i+1):
            print(" * ",end=" ")

        print()

def Pattern5(n):
    
        for i in range(n):
            for j in range(i+1):
                     print("*",end=" ")
            print()

        for i in range(n-1,0,-1):
              for j in range(i):
                print("*",end=" ")
              print()
          


def Pattern6(n):
    for i in range(n):
        for j in range(n-i):
            print("*",end=" ")
        print()


    

n=int(input("Enter  a number :"))
Pattern5(n)