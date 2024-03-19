def solution(num_list):
    answer = 0 
    mul = 1
    add = 0 
    
    for i in num_list:
        mul *= i
        add += i
        
    answer = 1 if mul < add **2 else 0
    
    return answer