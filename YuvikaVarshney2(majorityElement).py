def majorityElement(v: [int]) -> int:
    # Write your code here
    if len(v)==1:
        return v[0]
    n=(len(v)/2)
    v.sort()
    c=1
    for i in range(len(v)-1):
        if v[i]==v[i+1]:
            c+=1
        else:
            c=1
        if c>n:
            return v[i]
