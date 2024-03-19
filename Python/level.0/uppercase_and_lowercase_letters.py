str_input = input()

text = ""

for char in str_input:
    if char.islower():
        text += char.upper()
    else:
        text += char.lower()

print(text)
