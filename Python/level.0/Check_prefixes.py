def solution(my_string, is_prefix):
    answer = my_string.startswith(is_prefix)
    if(answer):
        return 1
    else:
        return 0
