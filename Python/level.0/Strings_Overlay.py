def solution(my_string, overwrite_string, s):
    ss = len(overwrite_string)
    answer = my_string[:s] + overwrite_string + my_string[s+ss:]
  
    return answer