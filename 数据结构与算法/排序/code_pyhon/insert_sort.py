def sort(l):
    for i in range(1,len(l)):
        j=i
        while (j>0 & l[j]<l[j-1]):
            l[j],l[j-1]=l[j-1],l[j]
            j=j-1
    return l

def main():
    l=[6,5,3,4,2,9]
    l=sort(l)
    print(l)

if __name__=='__main__':
    main()
