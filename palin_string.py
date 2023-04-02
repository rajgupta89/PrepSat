def pali(s):
    return s==s[::-1]
def score(s):
    palindrome=[]
    count=0
    for i in range(len(s)-3):
        if pali(s[i:i+4]):
            palindrome.append(s[i:i+4])
        if i<len(s)-4 and pali(s[i:i+5]):
            palindrome.append(s[i:i+5])
    for i in palindrome:
        if len(i)==4:
            count+=5
        if len(i)==5:
            count+=10
    return count
def main():
    s=input()
    result=score(s);
    print(result)
if __name__=="__main__":
    main()