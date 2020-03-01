def bubble_sort(l):
    r=list(range(len(l)))[::-1]
    for i in r:
        is_swap=False
        j=0
        while j<i:
            if l[j]>l[j+1]:
                l[j],l[j+1]=l[j+1],l[j]
                is_swap=True
            j=j+1
    return l

def main():
    l=[1,6,3,5,9,2]
    l=bubble_sort(l)
    print(l)

if __name__=='__main__':
    main()
