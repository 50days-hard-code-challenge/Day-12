def read(n: int, book: [int], target: int) -> str:
    # Write your code here.
    n=len(book)
    for i in range(n-1):
        for j in range(i+1,n):
            if book[i]+book[j]==target:
                return "YES"
    return "NO"
