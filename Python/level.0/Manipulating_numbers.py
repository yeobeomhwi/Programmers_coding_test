def solution(n, control):
    answer = n
    
    for c in control:
        if c == "w" :
            answer = answer + 1
        elif c == "s" :
            answer = answer - 1
        elif c == "d" :
            answer = answer + 10
        else :
            answer = answer - 10
        
    return answer

print(solution(0, "wsdawsdassw"))