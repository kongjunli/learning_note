import sys
def select_sort(l):
    for i in range(0,len(l)):
        index=i
        for j in range (i+1,len(l)):
            if l[j]<l[index]:
                index=j
        l[i],l[index]=l[index],l[i] #python交换列表元素的位置，两个列表互换相同
    return l

def main():
    l=[1,4,10,23,56]
    l=select_sort(l)
    print(l)

if __name__=='__main__':
    main()
